package com.taufeeque.springCoreProblemStatement10;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MovieBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Movie) {
            Movie movie = (Movie) bean;
            movie.beforeInitialization();
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof Movie) {
            Movie movie = (Movie) bean;
            movie.afterInitialization();
        }
        return bean;
    }
}


