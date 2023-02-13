package com.example.countryinformation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.content.Intent;
import android.os.Bundle;

public class BrazilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brazil);

        AppCompatTextView capitalName = findViewById(R.id.capital_answer);
        AppCompatTextView populationName = findViewById(R.id.population_answer);
        AppCompatTextView currencyName = findViewById(R.id.currency_answer);
        AppCompatTextView areaName = findViewById(R.id.area_answer);
        AppCompatTextView languageName = findViewById(R.id.language_answer);
        AppCompatImageButton backButton = findViewById(R.id.back_button);
        AppCompatTextView populationUnit = findViewById(R.id.population_unit);
        AppCompatTextView areaUnit = findViewById(R.id.area_unit);

        backButton.setOnClickListener(view -> startActivity(new Intent(BrazilActivity.this,MainActivity.class)));

        //create an object
        CountryClass country = new CountryClass();


        //setting data
        country.setPopulation(214.3);
        country.setArea(8.516);
        country.setCurrency("Real R$");
        country.setLanguage("Portuguese");
        country.setCapital("Brasília");
        country.setAreaUnit("million km2");
        country.setPopulationUnit("million");

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