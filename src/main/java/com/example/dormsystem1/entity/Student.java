package com.example.dormsystem1.entity;
import lombok.Data;

@Data
public class Student {
    private Long studentId;
    private String studentNo;
    private String studentName;
    private String gender;
    private String className;
    private String phone;
}