package com.weilan.entity;

import com.weilan.api.Book;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author weilan
 * @create 2021-08-07 6:57
 */
@Component(value = "book")
public class BookImpl implements Serializable, Book {
    private Integer id;
    private String name;
    private Double price;
    private String author;

    public BookImpl() {
    }

    public BookImpl(Integer id, String name, Double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                '}';
    }
}
