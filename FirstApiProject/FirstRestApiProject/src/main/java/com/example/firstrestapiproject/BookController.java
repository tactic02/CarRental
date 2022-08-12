package com.example.firstrestapiproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @GetMapping("/api/books")
    @ResponseBody
    List<Book> getAllBooks(){
        return List.of(
                new Book("Harry Potter", "J. K. Rowling", 1997, 223),
                new Book("Cień wiatru", "Carlos Ruiz", 2001, 565),
                new Book("Latarnik", "Henryk Sienkiewicz", 1881, 24)
        );
    }

    @GetMapping("api/books/1")
    @ResponseBody
    Book getOneBook(){
        return new Book("Harry Potter", "J. K. Rowling", 1997, 223);
    }
}
