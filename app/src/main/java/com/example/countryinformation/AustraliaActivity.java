package com.example.countryinformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;

public class AustraliaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_australia);

        AppCompatTextView capitalName = findViewById(R.id.capital_answer);

        CountryClass country = new CountryClass();
        country.setCaptial("Canberra");
        capitalName.setText(country.getCaptial());
    }
}