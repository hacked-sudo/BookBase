package com.slb.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Book {
    @GetMapping("book")
    public String bookInStock(){
        return "<h1>Harry Potter and The Half Blood Prince</h1>";

    }
}
