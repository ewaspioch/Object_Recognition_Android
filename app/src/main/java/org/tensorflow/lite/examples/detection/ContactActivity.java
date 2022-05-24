/*
Copyright 2022 Karolina Jakubowska
Copyright 2022 Paulina Tymoszuk

All Rights Reserved.

This file has been modified by Karolina Jakubowska and Paulina Tymoszuk to add better interface for application.
*/

package org.tensorflow.lite.examples.detection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ContactActivity extends AppCompatActivity {

    public View contactUs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        contactUs=findViewById(R.id.mailButton);
        contactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_SENDTO, Uri.parse("mailto:contact@ai.com")));
            }
        });

    }
}