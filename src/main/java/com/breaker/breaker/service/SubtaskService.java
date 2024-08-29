package com.breaker.breaker.service;

import com.breaker.breaker.repository.SubtaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubtaskService {
    @Autowired
    private SubtaskRepository subtaskRepository;
    // Methods for managing subtasks
}
