package com.practise.web;

import com.practise.domain.Book;
import com.practise.service.MockerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MockController {

    @Autowired
    MockerService mockService;

    @GetMapping("/")
    public String helloWorld() {
        return mockService.getMessage();
    }

    @GetMapping("/api/v1/books")
    public ResponseEntity<List<Book>> getBooks(){
        return new ResponseEntity<List<Book>>(mockService.getBooks(), HttpStatus.OK);
    }

    @PostMapping("/api/v1/book")
    public ResponseEntity<String> addBook(@RequestBody Book book){
        mockService.addBook(book);
        return new ResponseEntity<String>("Successfully adding a book", HttpStatus.OK);
    }
}
