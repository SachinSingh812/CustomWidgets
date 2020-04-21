package com.example.custom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.custom.customWidgets.CustomCheckActivity;

public class MainActivity extends AppCompatActivity {
    Button goToCusotmButton , goToCustomRadio , goToCustomCheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        setupListeners();
    }

    void init(){

        goToCusotmButton = findViewById(R.id.goTo_customButton);
        goToCustomCheck = findViewById(R.id.goTo_customCheck);
        goToCustomRadio = findViewById(R.id.goTo_customRadio);

    }

    void setupListeners(){

        goToCusotmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,CustomButtonActivity.class);
                startActivity(intent);

            }
        });

        goToCustomRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this,CustomRadioButtonActivity.class);
                startActivity(intent);

            }
        });

        goToCustomCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(MainActivity.this, CustomCheckActivity.class);
                startActivity(intent);

            }
        });

    }
}
