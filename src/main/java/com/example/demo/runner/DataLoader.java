package com.example.demo.runner;

import com.example.demo.entity.StudyLog;
import com.example.demo.repository.StudyLogRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final StudyLogRepository repository;

    public DataLoader(StudyLogRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {
        StudyLog log = new StudyLog();
        log.setTitle("初めてのStudyLog");
        log.setMemo("DB保存テスト");
        log.setDate(LocalDate.now());
        repository.save(log);

        System.out.println("StudyLogを保存しました: " + log.getId());
    }
}
