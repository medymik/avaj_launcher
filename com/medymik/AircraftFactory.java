package com.medymik;

public class AircraftFactory {
    public static Flyable newAircraft(String type, String name, int longitude, int latitude, int height) {
        Coordinates coordinates = new Coordinates(longitude, latitude, height);
        Flyable flyableRef;
        switch (type) {
            case "Baloon":
                flyableRef = new Baloon(name, coordinates);
                break;
            case "Helicopter":
                flyableRef = new Helicopter(name, coordinates);
            case "JetPlane":
                flyableRef = new JetPlane(name, coordinates);
            default:
                flyableRef = null;
        }
        return flyableRef;
    }
}
