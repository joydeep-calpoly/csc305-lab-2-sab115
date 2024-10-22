package org.example;
import java.util.List;
import java.util.ArrayList;

public class Person {

    private final String name;
    private final List<String> knownFor;
    private final List<Award> awards;

    public Person(String name, List<String> knownFor, List<Award> awards) {
        this.name = name;
        this.knownFor = knownFor;
        this.awards = awards;
    }

    // Getters for name, knownFor, and awards
    public String getName() {
        return name;
    }

    public List<String> getKnownFor() {
        return knownFor;
    }

    public List<Award> getAwards() {
        return awards;
    }
}
