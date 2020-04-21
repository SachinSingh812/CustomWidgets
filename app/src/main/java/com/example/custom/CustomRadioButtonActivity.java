package com.example.custom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class CustomRadioButtonActivity extends AppCompatActivity {

    RadioGroup genderRadioGroup;
    RadioButton genderRadioButton;
    Button submitGenderBbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_radio_button);

        init();
        setUpListeners();
    }

    void init(){
        genderRadioGroup = findViewById(R.id.radio_group);
        submitGenderBbutton = findViewById(R.id.submit_gender);
    }

    void setUpListeners(){
        submitGenderBbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int genderID = genderRadioGroup.getCheckedRadioButtonId();
                genderRadioButton = findViewById(genderID);
                if(genderID==-1){
                    Toast.makeText(CustomRadioButtonActivity.this,"Invalid Selction", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(CustomRadioButtonActivity.this,"You have selected " + genderRadioButton.getText() , Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
