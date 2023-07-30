package org.example.controllers;

import org.example.models.EmptyJsonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/products")
public class ProductController {
    @GetMapping("")
    public ResponseEntity<?> getAllProducts() {
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }
    @GetMapping("/licenses")
    public ResponseEntity<?> getProductLicenses() {
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }
}
