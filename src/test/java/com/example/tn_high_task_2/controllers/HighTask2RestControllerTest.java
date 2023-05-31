package com.example.tn_high_task_2.controllers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = HighTask2RestController.class)
class HighTask2RestControllerTest {

    public static final String URL_FOR_ONE_TASK = "http://localhost:8080/api/v1/tasks/1";
    public static final String URL_FOR_ALL_TASKS = "http://localhost:8080/api/v1/tasks";

    @Autowired
    private MockMvc mvc;

    @Test
    @DisplayName("Testing get mapping for one task")
    void getTask() throws Exception {
        mvc.perform(get(URL_FOR_ONE_TASK))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Get method for one Task"));
    }

    @Test
    @DisplayName("Testing get mapping for all task")
    void getTasks() throws Exception {
        mvc.perform(get(URL_FOR_ALL_TASKS))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Get method for all Tasks"));
    }

    @Test
    @DisplayName("Testing post mapping for task")
    void createTask() throws Exception {
        mvc.perform(post(URL_FOR_ALL_TASKS))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Post method for creating Task"));
    }

    @Test
    @DisplayName("Testing put mapping for one task")
    void updateTask() throws Exception {
        mvc.perform(put(URL_FOR_ONE_TASK))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Put method for updating Task"));
    }

    @Test
    @DisplayName("Testing delete mapping for one task")
    void deleteTask() throws Exception {
        mvc.perform(delete(URL_FOR_ONE_TASK))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Delete method for deleting Task"));
    }
}