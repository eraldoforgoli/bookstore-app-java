package com.eraldo.Resources;

import com.eraldo.controller.AuthorController;
import com.eraldo.controller.BookController;
import com.eraldo.dao.Author;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("authors")
public class AuthorResource {

    private AuthorController authorController = new AuthorController();

    @GET
    @Path("/authorinfo/{authorname}")
    @Produces(MediaType.APPLICATION_JSON)
    public Author getAuthorInfo(@PathParam("authorname") String authorName){
        return authorController.getAuthorInfo(authorName);
    }
}
