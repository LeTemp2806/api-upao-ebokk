package com.example.apiupaobook.service;

import com.example.apiupaobook.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

public interface BookService {
    Book createBook(Book book);
    List<Book> getAllBooks();
}
