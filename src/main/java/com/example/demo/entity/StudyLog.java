package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class StudyLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "study_minutes")
    private Integer minute;
    private LocalDate date;

    // getter / setter
    public Long getId() { return id; }
    public void setId(Long id) {this.id = id; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public Integer getMinute() { return minute; }
    public void setMinute(Integer minute) { this.minute = minute; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}