package com.example.demo.controller;

import com.example.demo.entity.StudyLog;
import com.example.demo.service.StudyLogService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;

@RestController
@RequestMapping("/studylogs")
public class StudyLogController {

    private final StudyLogService service;

    public StudyLogController(StudyLogService service) {
        this.service = service;
    }

    // GET /studylogs で全件取得
    @GetMapping
    public List<StudyLog> getAllLogs() {
        return service.findAll();
    }
}
