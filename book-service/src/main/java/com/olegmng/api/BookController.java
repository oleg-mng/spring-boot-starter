package com.olegmng.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;

@RestController
@RequestMapping("/api/book")
public class BookController {

    @GetMapping("/{id}")
    public BookResponse getBookById(@PathVariable long id){
        BookResponse book = new BookResponse();
        book.setId(id);
        book.setName("Name #"+id);
        return book;
    }
}
