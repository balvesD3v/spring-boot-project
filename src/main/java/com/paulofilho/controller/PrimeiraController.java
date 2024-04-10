package com.paulofilho.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@RestController
@RequestMapping("/primeiraController")
public class PrimeiraController {
    @GetMapping("/primeiraMetodo/{id}")
    public String primeiroMetodo(@PathVariable String id) {
        return "O parametro route é " + id;
    }

    @GetMapping("/metodoQueryParam")
    public String metodoQueryParam(@RequestParam String id) {
        return "O parametro query é " + id;
    }

    @GetMapping("/metodoQueryParam1")
    public String metodoQueryParam2(@RequestParam Map<String, String> allParams) {
        return "O metodoQueryParam2 é " + allParams.entrySet();
    }

    @PostMapping("/bodyParam")
    public String postMethodName(@RequestBody User user) {
        return "process POST request " + user.name;
    }

    @PostMapping("/headerParam")
    public String headerParam(@RequestHeader("name") String name) {
        return "process POST request " + name;
    }

    @PostMapping("/headerParamList")
    public String headerParam(@RequestHeader Map<String, String> headers) {
        return "process POST request " + headers.entrySet();
    }

    @GetMapping("/reponseEntity")
    public ResponseEntity<Object> methodResponseEntity() {
        return ResponseEntity.status(201).body("Message Error");
    }

    record User(String name) {
    }

}
