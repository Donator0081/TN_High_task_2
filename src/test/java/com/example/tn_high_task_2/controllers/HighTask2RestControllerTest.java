package com.example.tn_high_task_2.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@WebMvcTest(controllers = HighTask2RestController.class)
class HighTask2RestControllerTest {

    public static final String URL_FOR_ONE_TASK = "http://localhost:8080/api/v1/tasks/1";
    public static final String URL_FOR_ALL_TASKS = "http://localhost:8080/api/v1/tasks";

    @Autowired
    private MockMvc mvc;

    @Test
    void getTask() throws Exception {
        mvc.perform(get(URL_FOR_ONE_TASK))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Get method for one Task"));
    }

    @Test
    void getTasks() throws Exception {
        mvc.perform(get(URL_FOR_ALL_TASKS))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Get method for all Tasks"));
    }

    @Test
    void createTask() throws Exception {
        mvc.perform(post(URL_FOR_ALL_TASKS))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Post method for creating Task"));
    }

    @Test
    void updateTask() throws Exception {
        mvc.perform(put(URL_FOR_ONE_TASK))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Put method for updating Task"));
    }

    @Test
    void deleteTask() throws Exception {
        mvc.perform(delete(URL_FOR_ONE_TASK))
                .andExpect(status().isOk())
                .andDo(print())
                .andExpect(content().string("Delete method for deleting Task"));
    }
}