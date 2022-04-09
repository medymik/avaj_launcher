package com.medymik;

public class Aircraft {
    protected long id;
    protected String name;
    protected Coordinates coordinates;
    private static int idCounter = 0;

    public Aircraft(String name, Coordinates coordinates) {
        this.name = name;
        this.coordinates = coordinates;
        this.id = nextId();
        idCounter++;
    }

    private static long nextId() {
        return idCounter;
    }
}
