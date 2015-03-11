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

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ToDoTask add(@RequestBody ToDoTask task) {
        // TODO implement business logic
        return null;
    }


    // TODO Add a GET method listing existing tasks
}
