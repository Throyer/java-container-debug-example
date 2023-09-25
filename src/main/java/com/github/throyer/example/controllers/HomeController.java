package com.github.throyer.example.controllers;

import com.github.throyer.example.services.ExampleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class HomeController {
  private final ExampleService service;
  
  @GetMapping
  public Object index() {
    return service.example();
  }
}
