package com.weilan.entity;

import org.springframework.stereotype.Component;

/**
 * @author weilan
 * @create 2021-08-07 6:52
 */
@Component(value = "hello")
public class HelloWorld {
    private String name;

    public HelloWorld() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "HelloWorld{" +
                "name='" + name + '\'' +
                '}';
    }
}
