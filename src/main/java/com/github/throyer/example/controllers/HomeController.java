package com.github.throyer.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import static java.util.Optional.ofNullable;

@RestController
@RequestMapping("/")
public class HomeController {
  @GetMapping
  public Map<?,?> index(String name) {
    return Map.of(
      "message", "hello world",
      "nome", ofNullable(name).orElse("")
    );
  }
}
