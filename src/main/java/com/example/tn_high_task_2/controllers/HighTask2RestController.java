package com.example.tn_high_task_2.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${task_url}")
public class HighTask2RestController {

    @GetMapping("{id}")
    public String getTask(@PathVariable int id) {
        return "Get method for one Task";
    }

    @GetMapping
    public String getTasks() {
        return "Get method for all Tasks";
    }

    @PostMapping
    public String createTask() {
        return "Post method for creating Task";
    }

    @PutMapping("{id}")
    public String updateTask(@PathVariable int id) {
        return "Put method for updating Task";
    }

    @DeleteMapping("{id}")
    public String deleteTask(@PathVariable int id) {
        return "Delete method for deleting Task";
    }

}
