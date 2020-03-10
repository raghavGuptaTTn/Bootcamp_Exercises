package com.example.demo.books;

import org.apache.coyote.http11.filters.IdentityOutputFilter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        System.out.println("books controller invoked ");
        return Arrays.asList(
                new Book(1, "spring 5.0", "charles"),
                new Book(2, "swing 5.0", "sharma"),
                new Book(3, "django 5.0", "thomas")
        );
    }
}
