package com.example.custom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CustomButtonActivity extends AppCompatActivity {

    Button customButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_button);

        init();
        setUpListeners();
    }

    void  init(){
        customButton = findViewById(R.id.custom_button);
    }

    void setUpListeners(){
        customButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CustomButtonActivity.this, "This is a Custom Button", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
