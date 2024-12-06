package com.example.appointment;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView ap, adopt,product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ap = findViewById(R.id.imageView);
        adopt = findViewById(R.id.imageView4);
        product = findViewById(R.id.imageView3);
        product.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Products_view.class));
        });
        adopt.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Adopt_view.class));
        });
        ap.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, Appointment_view.class));
        });


    }
}