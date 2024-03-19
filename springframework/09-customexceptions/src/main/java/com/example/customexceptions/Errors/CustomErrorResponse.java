package com.example.customexceptions.Errors;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomErrorResponse {
    private String message;
    private long status;
    private long timestamp;
}
