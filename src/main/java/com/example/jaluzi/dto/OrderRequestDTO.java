package com.example.jaluzi.dto;

import lombok.Data;
import java.util.List;

@Data
public class OrderRequestDTO {
    private Long key;
    private String customerName;
    private String address;
    private String phoneNumber;
    private String date;
    private Double total;
    private Double deposit;
    private Double reminder;
    private String note;
    private boolean completed;
    private boolean workshopCompleted;
    private List<SizesRequestDTO> sizes;
    private double sizesSquareTotal;
}
