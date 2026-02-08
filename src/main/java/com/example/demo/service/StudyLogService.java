package com.example.demo.service;

import com.example.demo.repository.StudyLogRepository;
import com.example.demo.entity.StudyLog;
import org.springframework.lang.NonNull;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudyLogService {
    private final StudyLogRepository repository;

    public StudyLogService(StudyLogRepository repository) {
        this.repository = repository;
    }

    public List<StudyLog> findAll() {
        return repository.findAll();
    }

    public StudyLog create(@NonNull StudyLog studyLog){
        return repository.save(studyLog);
    }
}
