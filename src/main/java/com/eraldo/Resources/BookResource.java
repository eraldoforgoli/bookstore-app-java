package com.eraldo.Resources;

import com.eraldo.controller.BookController;
import com.eraldo.dao.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("books")
public class BookResource {

    private  BookController bookController = new BookController();

    @GET
    @Path("/allbooks")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> getIt() {
        return bookController.getAllBooks();
    }

    @GET
    @Path("/bookdescription/{bookId}")
    @Produces(MediaType.APPLICATION_JSON)
    public String getBookDescription(@PathParam("bookId") int bookId){
        return bookController.getBookDescription(bookId);
    }

    @GET
    @Path("/bookinfo/{bookId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Book getBookInfo(@PathParam("bookId") int bookId){
        return bookController.getBookInfo(bookId);
    }
}
