package com.example.countryinformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.countryinformation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        AppCompatButton australiaButton = findViewById(R.id.australia_button);
        AppCompatButton indiaButton = findViewById(R.id.india_button);
        AppCompatButton chinaButton = findViewById(R.id.china_button);
        AppCompatButton franceButton = findViewById(R.id.france_button);
        AppCompatButton brazilButton = findViewById(R.id.brazil_button);
        AppCompatButton egyptButton = findViewById(R.id.egypt_button);

        //Changing layout
        australiaButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, AustraliaActivity.class)));
        indiaButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, IndiaActivity.class)));
        chinaButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, ChinaActivity.class)));
        franceButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, FranceActivity.class)));
        brazilButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, BrazilActivity.class)));
        egyptButton.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, EgyptActivity.class)));



    }
}