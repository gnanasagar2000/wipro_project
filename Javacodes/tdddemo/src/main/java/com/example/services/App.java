package com.example.services;

import com.example.Models.Address;

public class App {
    
    public static void main(String[] args)
    {
         Address studentAddr = new Address();
        studentAddr.setCity(city:"Dehradun");
        studentAddr.setCountry(country:"India");
        studentAddr.setState(state:"UK");

        Student s = new Student();
        s.setAddr(studentAddr);

        System.out.println(s.getAddr());
    }
}
