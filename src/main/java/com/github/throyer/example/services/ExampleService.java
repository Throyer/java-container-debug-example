package com.github.throyer.example.services;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class ExampleService {
  public Object example() {
    return Map.of("message", "hello world"); 
  }
}
