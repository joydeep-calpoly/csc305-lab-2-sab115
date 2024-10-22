package org.example;

public class Award {

    private final String name;
    private final int year;

    public Award(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}