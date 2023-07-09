package com.taufeeque.springCoreProblemStatement13;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class App {

    private CoffeeShop coffeeShop;

    @Autowired
    public App(@Qualifier("secunderabadAddress") String hyderabadAddress) {
        coffeeShop = new CoffeeShop(hyderabadAddress);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class, CoffeeShopConfig.class);
        App app = context.getBean(App.class);
        app.coffeeShop.serveCoffee();
        context.close();
    }
}