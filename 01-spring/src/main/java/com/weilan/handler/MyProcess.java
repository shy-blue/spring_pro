package com.weilan.handler;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author weilan
 * @create 2021-08-08 17:34
 */
public class MyProcess implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization被调用了");
        System.out.println("beanName = " + beanName);
        System.out.println("bean = " + bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization被调用了");
        System.out.println("beanName = " + beanName);
        System.out.println("bean = " + bean);
        return bean;
    }
}
