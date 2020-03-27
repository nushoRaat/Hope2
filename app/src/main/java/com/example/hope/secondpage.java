package com.example.hope;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class secondpage extends AppCompatActivity {

    RadioButton emailRadio,phoneRadio;

    EditText emailText,phoneText;

    Button emailbtn,phonebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        emailRadio = findViewById(R.id.radio_email);
        phoneRadio = findViewById(R.id.radio_phone);

        emailText =  findViewById(R.id.emailText);
        phoneText =  findViewById(R.id.phoneText);

        emailbtn =  findViewById(R.id.loginButton);
        phonebtn =  findViewById(R.id.verifyButton);



        emailRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                emailText.setVisibility(View.VISIBLE);
                emailbtn.setVisibility(View.VISIBLE);

                phoneText.setVisibility(View.INVISIBLE);
                phonebtn.setVisibility(View.INVISIBLE);

            }
        });


        phoneRadio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                emailText.setVisibility(View.INVISIBLE);
                emailbtn.setVisibility(View.INVISIBLE);

                phoneText.setVisibility(View.VISIBLE);
                phonebtn.setVisibility(View.VISIBLE);

            }
        });



    }
}
