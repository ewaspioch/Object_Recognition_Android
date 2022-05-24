/*
Copyright 2022 Karolina Jakubowska
Copyright 2022 Paulina Tymoszuk

All Rights Reserved.

This file has been modified by Karolina Jakubowska and Paulina Tymoszuk to add better interface for application.
*/


package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class HomeActivity extends AppCompatActivity {
    private View startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        startButton = findViewById(R.id.startButton);
        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this, DetectorActivity.class));
                finish();
            }
        });
    }
}