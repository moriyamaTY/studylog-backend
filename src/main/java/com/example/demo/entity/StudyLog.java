package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class StudyLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String memo;
    private LocalDate date;

    // getter / setter
    public Long getId() { return id; }
    public void setId(Long id) {this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getMemo() { return memo; }
    public void setMemo(String memo) { this.memo = memo; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}