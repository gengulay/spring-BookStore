package com.bookstore.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.domain.Book;
import com.bookstore.repository.BookRepository;
import com.bookstore.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book save(Book book) {
		return bookRepository.save(book);
	}

	@Override
	public List<Book> findAllBooks() {
		return (List<Book>) bookRepository.findAll();
	}

	@Override
	public Book findOneById(Long id) {
		return bookRepository.findOne(id);
	}

}
