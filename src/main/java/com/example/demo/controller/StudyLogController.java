package com.example.demo.controller;

import com.example.demo.entity.StudyLog;
import com.example.demo.repository.StudyLogRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/studylogs")
public class StudyLogController {

    private final StudyLogRepository repository;

    public StudyLogController(StudyLogRepository repository) {
        this.repository = repository;
    }

    // GET /studylogs で全件取得
    @GetMapping
    public List<StudyLog> getAllLogs() {
        return repository.findAll();
    }

    // POST /studylogs で新しいログを保存
    @PostMapping
    public StudyLog createLog(@RequestBody StudyLog log) {
        return repository.save(log);
    }
}
