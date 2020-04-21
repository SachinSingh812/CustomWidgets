package com.example.custom.customWidgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.example.custom.R;

public class CustomCheckActivity extends AppCompatActivity {

    CheckBox flutter , android, ionic, react;
    Button submitSDK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_check);

        init();
        setupListeners();
    }

    void init(){

        flutter = findViewById(R.id.item1);
        android = findViewById(R.id.item2);
        ionic = findViewById(R.id.item3);
        react = findViewById(R.id.item4);
        submitSDK = findViewById(R.id.submit_sdk);

    }

    void setupListeners(){

        submitSDK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result=new StringBuilder();
                if(flutter.isChecked()){
                    result.append("\nFlutter");
                }
                if(android.isChecked()){
                    result.append("\nAndroid");
                }
                if(ionic.isChecked()){
                    result.append("\nIonic");
                }

                if(react.isChecked()){
                    result.append("\nReact");
                }
                Toast.makeText(getApplicationContext(), "\nYou have Opted following course:"+ result.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
