package com.weilan.myfactory;

import com.weilan.api.Book;
import com.weilan.entity.BookImpl;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author weilan
 * @create 2021-08-07 7:02
 */
public class BookFactoryBean implements FactoryBean<BookImpl> {
    @Override
    public BookImpl getObject() throws Exception {
        return new BookImpl(1,"xw",12.0,"xw");
    }

    @Override
    public Class<?> getObjectType() {
        return BookImpl.class;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
