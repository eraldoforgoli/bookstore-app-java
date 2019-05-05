package com.eraldo.controller;

import com.eraldo.dao.Book;
import com.eraldo.dao.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class BookController {

    public List<Book> getAllBooks(){
        Session session = SessionUtil.getSession();
        Query query = session.createQuery("from Book");
        List<Book> books =  query.list();
        session.close();
        return books;
    }

    public String getBookDescription(Integer bookId){
        Session session = SessionUtil.getSession();
        Query query =  session.createQuery("select description from Book b  where b.bookId=:bookId");
        query.setParameter("bookId", bookId);
        String description = query.uniqueResult().toString();
        session.close();
        return description;
    }

    public Book getBookInfo(Integer bookId){
        Session session = SessionUtil.getSession();
        Query query = session.createQuery(" from Book  where book_id=:bookId");
        query.setParameter("bookId", bookId);
        Book book = (Book)query.uniqueResult();
        session.close();
        return book;
    }
}
