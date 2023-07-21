package org.example.controllers;

import org.example.models.EmptyJsonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/forum")
public class ForumController {
    @GetMapping
    public ResponseEntity<?> getAllPayments() {
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }
}
