package com.example.countryinformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;

public class ChinaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_china);

        AppCompatTextView capitalName = findViewById(R.id.capital_answer);
        AppCompatTextView populationName = findViewById(R.id.population_answer);
        AppCompatTextView currencyName = findViewById(R.id.currency_answer);
        AppCompatTextView areaName = findViewById(R.id.area_answer);
        AppCompatTextView languageName = findViewById(R.id.language_answer);
        AppCompatImageButton backButton = findViewById(R.id.back_button);
        AppCompatTextView populationUnit = findViewById(R.id.population_unit);
        AppCompatTextView areaUnit = findViewById(R.id.area_unit);

        backButton.setOnClickListener(view -> startActivity(new Intent(ChinaActivity.this,MainActivity.class)));

        //create an object
        CountryClass country = new CountryClass();


        //setting data
        country.setPopulation(1.412);
        country.setArea(9.597);
        country.setCurrency("Yuan ￥");
        country.setLanguage("Chinese");
        country.setCapital("Beijing");
        country.setAreaUnit("million km2");
        country.setPopulationUnit("billion");

        //setting text
        capitalName.setText(country.getCapital());
        currencyName.setText(country.getCurrency());
        languageName.setText(country.getLanguage());
        String populationString = new Double(country.getPopulation()).toString();
        String areaString = new Double(country.getArea()).toString();
        populationName.setText(populationString);
        areaName.setText(areaString);
        populationUnit.setText(country.getPopulationUnit());
        areaUnit.setText(country.getAreaUnit());
    }
}