package com.medymik;

import java.util.ArrayList;

public class WeatherProvider {

    private WeatherProvider weatherProvider;
    private ArrayList<String> weather;

    private WeatherProvider() {
        this.weather = new ArrayList<>();
    }

    public WeatherProvider getProvider() {
        if (weatherProvider == null) {
            weatherProvider = new WeatherProvider();
        }
        return weatherProvider;
    }

    public String getCurrentWeather(Coordinates coordinates) {
        // TODO: Returns weather based on coordinates
        return this.weather.get(0);
    }
}
