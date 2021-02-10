package com.marcuschiu.testframeworkexampleboot221.service;

import org.junit.Test;

import java.util.List;

public class BookServiceTest {

    @Test
    public void test() {
        BookService bookService = new BookService();
        List<String> actual = bookService.getBookNames();
    }
}
