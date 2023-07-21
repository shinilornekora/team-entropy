package org.example.controllers;

import org.example.models.EmptyJsonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }

    @GetMapping("/active")
    public ResponseEntity<?> getUserActive() {
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }

    @GetMapping("/inactive")
    public ResponseEntity<?> getUserInactive() {
        return new ResponseEntity<>(new EmptyJsonResponse(), HttpStatus.OK);
    }

}
