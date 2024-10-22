package org.example.jackson;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

class Person {
    private final String name;
    private final List<String> knownFor;
    private final List<Award> awards;

    private Person(
            @JsonProperty("name") String name,
            @JsonProperty("knownFor") List<String> knownFor,
            @JsonProperty("awards") List<Award> awards) {
        this.name = name;
        this.knownFor = knownFor;
        this.awards = awards;
    }

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
