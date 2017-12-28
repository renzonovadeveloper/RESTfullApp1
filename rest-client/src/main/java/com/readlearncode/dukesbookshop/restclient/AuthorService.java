package com.readlearncode.dukesbookshop.restclient;

import com.readlearncode.dukesbookshop.domain.Author;

import java.util.List;

/**
 *
 *
 *
 * @version 1.0
 */
public interface AuthorService {

     List<Author> getAuthors();

     Author getAuthor(String id);

}
