package com.example.dormsystem1.entity;
import lombok.Data;
import java.time.LocalDate;

@Data
public class Violation {
    private Long violationId;
    private Long studentId;
    private LocalDate violationDate;
    private String violationType;
    private String description;
    private String punishment;
    private String studentName;
    private String studentNo;
}