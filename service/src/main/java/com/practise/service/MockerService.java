package com.practise.service;

import com.practise.domain.Book;
import com.practise.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MockerService {

    @Autowired
    public BookRepo repo;

    public String getMessage() {
        return "Hello World";
    }

    public Boolean addBook(Book book) {
        Book save = repo.save(book);
        return save.getId() == null ? false : true;
    }

    public List<Book> getBooks() {
        return repo.findAll();
    }
}
