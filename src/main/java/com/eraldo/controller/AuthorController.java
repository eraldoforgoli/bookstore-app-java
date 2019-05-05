package com.eraldo.controller;

import com.eraldo.dao.Author;
import com.eraldo.dao.SessionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class AuthorController {

    public Author getAuthorInfo(String authorName){
        Session session = SessionUtil.getSession();
        Query query = session.createQuery(" from Author  where name" +
                "=:authorName");
        query.setParameter("authorName", authorName);
        Author author = (Author)query.uniqueResult();
        session.close();
        return author;
    }
}
