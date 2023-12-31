package com.example.f23_3175_g12_serenitysoundsapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ScheduleActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        // Find the login button by its ID
        Button loginButton = findViewById(R.id.btnBackFromSchedule);

        // Set an OnClickListener for the login button
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate back to MainActivity
                Intent intent = new Intent(ScheduleActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
