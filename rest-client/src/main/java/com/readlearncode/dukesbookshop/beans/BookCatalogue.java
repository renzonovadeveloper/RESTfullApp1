package com.readlearncode.dukesbookshop.beans;

import com.readlearncode.dukesbookshop.restclient.BookService;
import com.readlearncode.dukesbookshop.domain.Book;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 *
 *
 *
 * @version 1.0
 */
@Named
@RequestScoped
public class BookCatalogue {

    @Inject
    private BookService bookService;

    private List<Book> books;

    @PostConstruct
    public void initialize(){
        books = bookService.getBooks();
    }

    public List<Book> getBooks()   {
        return books;
    }

}