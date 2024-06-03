package com.example.insuranceapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;



public class Request extends AppCompatActivity implements View.OnClickListener  {

    Button butn1,butn2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.request);


        butn1 = findViewById(R.id.contactbtn);
        butn1.setOnClickListener(this);
        butn1.setOnClickListener(e ->startActivity(new Intent(Request.this, contact.class)));

    }

    @Override
    public void onClick(View view) {

    }
}