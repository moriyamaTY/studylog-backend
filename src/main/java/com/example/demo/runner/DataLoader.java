package com.example.demo.runner;

import com.example.demo.entity.StudyLog;
import com.example.demo.service.StudyLogService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final StudyLogService service;

    public DataLoader(StudyLogService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) {
        StudyLog log = new StudyLog();
        log.setTitle("初めてのStudyLog");
        log.setMinute(110);
        log.setDate(LocalDate.now());
        service.create(log);

        System.out.println("StudyLogを保存しました: " + log.getId());
    }
}
