package com.example.services;

import com.example.Models.Address;
import com.example.Models.person;

public class services {
    public boolean isAddressSet(person p, Address addr){
        return p.getAddr().equals(addr) ? true : false;
    }
}
