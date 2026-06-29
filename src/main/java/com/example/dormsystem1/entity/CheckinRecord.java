package com.example.dormsystem1.entity;
import lombok.Data;
import java.time.LocalDate;

@Data
public class CheckinRecord {
    private Long checkinId;
    private Long studentId;
    private Long roomId;
    private LocalDate checkinAt;
    private LocalDate checkoutAt;
    private String status;
    private String studentName;
    private String studentNo;
    private String roomNo;
    private String buildingName;
}