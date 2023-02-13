package com.example.countryinformation;

public class CountryClass {
    private double population;
    private double area;
    private String language;
    private String currency;
    private String capital;
    private String populationUnit;
    private String areaUnit;

    public String getPopulationUnit() {
        return populationUnit;
    }

    public void setPopulationUnit(String populationUnit) {
        this.populationUnit = populationUnit;
    }

    public String getAreaUnit() {
        return areaUnit;
    }

    public void setAreaUnit(String areaUnit) {
        this.areaUnit = areaUnit;
    }

    public double getPopulation() {
        return population;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
