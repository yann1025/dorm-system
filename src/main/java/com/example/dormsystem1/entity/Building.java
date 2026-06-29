package com.example.dormsystem1.entity;
import lombok.Data;

@Data
public class Building {
    private Long buildingId;
    private String buildingName;
    private Integer floors;
    private String manager;
}