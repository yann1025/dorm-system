package com.example.dormsystem1.entity;
import lombok.Data;

@Data
public class Room {
    private Long roomId;
    private Long buildingId;
    private String roomNo;
    private Integer capacity;
    private String remark;
    private String buildingName;
    private Integer used;
}