package com.bookstore.service;

import java.util.List;

import com.bookstore.domain.Book;

public interface BookService {

	Book save(Book book);

	List<Book> findAllBooks();

	Book findOneById(Long id);

}
