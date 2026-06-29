package com.example.dormsystem1.entity;
import lombok.Data;
import java.time.LocalDate;

@Data
public class HygieneCheck {
    private Long checkId;
    private Long roomId;
    private LocalDate checkDate;
    private Integer score;
    private String checker;
    private String remark;
    private String roomNo;
    private String buildingName;
}