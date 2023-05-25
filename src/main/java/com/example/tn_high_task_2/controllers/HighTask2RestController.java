package com.example.tn_high_task_2.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/high-task-2/tasks")
public class HighTask2RestController {

    @GetMapping("{id}")
    public ResponseEntity<String> getTask(@PathVariable int id) {
        return new ResponseEntity<>("Get method for one Task", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> getTasks() {
        return new ResponseEntity<>("Get method for all Tasks", HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<String> createTask() {
        return new ResponseEntity<>("Post method for creating Task", HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> updateTask(@PathVariable int id) {
        return new ResponseEntity<>("Put method for updating Task", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTask(@PathVariable int id) {
        return new ResponseEntity<>("Delete method for deleting Task", HttpStatus.OK);
    }

}
