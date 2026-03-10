package com.example.lab4_intent;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {
    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvWelcome = findViewById(R.id.tvWelcome);
        String name = getIntent().getStringExtra("USER_NAME"); // Nhận dữ liệu

        if (name != null) {
            tvWelcome.setText("Xin chào, " + name);
        }
    }
}