package com.example.Models;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class student extends person {
    private int studentNumber;
    private int avgMark;

    public boolean isElgibleToEnroll(){
        return false;
    }
    
}
