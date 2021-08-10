package com.weilan.entity;

import org.springframework.stereotype.Component;

/**
 * @author weilan
 * @create 2021-08-07 19:01
 */
@Component
public class BookStrop {
    private BookImpl book;
    private String name;

    public BookStrop() {
    }

    public BookStrop(BookImpl book, String name) {
        this.book = book;
        this.name = name;
    }

    public BookImpl getBook() {
        return book;
    }

    public void setBook(BookImpl book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "BookStrop{" +
                "book=" + book +
                ", name='" + name + '\'' +
                '}';
    }
}
