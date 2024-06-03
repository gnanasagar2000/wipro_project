package com.example.Models;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class professor extends person {
    private double salary;
}
