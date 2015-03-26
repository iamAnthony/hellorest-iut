package com.ninja_squad.hellorest.controller;

import com.ninja_squad.hellorest.model.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class ToDoController {

    // We use a simple in memory list (don't do it in real life!)
    private final List<ToDoTask> tasks = new ArrayList<>();
    private String[] priorities = {"LOW", "HIGH", "DEFAULT", "BACKEND !", "Test"};

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ToDoTask add(@RequestBody ToDoTask task) {
        tasks.add(task);
        return task;
    }
    
    @RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<ToDoTask> list() {
        return tasks;
    }
    
    @RequestMapping("/priorities")
    public String[] prios() {
        return priorities;
    }
}
