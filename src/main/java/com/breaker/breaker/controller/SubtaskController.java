package com.breaker.breaker.controller;

import com.breaker.breaker.service.SubtaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/subtasks")
public class SubtaskController {
    @Autowired
    private SubtaskService subtaskService;
    // Endpoints for subtask CRUD operations
}

