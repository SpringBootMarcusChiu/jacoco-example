package com.marcuschiu.testframeworkexampleboot221.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    public BookService() {
    }

    public List<String> getBookNames() {
        List<String> names = new ArrayList<>();
        names.add("Harry Potter");
        names.add("Pokemon");
        return names;
    }
}
