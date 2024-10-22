package org.example.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;

class Award {
    private final String name;
    private final int year;

    private Award(@JsonProperty("name") String name, @JsonProperty("year") int year) {
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
