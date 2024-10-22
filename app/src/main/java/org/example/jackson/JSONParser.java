package org.example.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Award;
import org.example.Person;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class JSONParser {
    public static void main(String[] args) {
        try {
            InputStream inputStream = JSONParser.class.getClassLoader().getResourceAsStream("input1.json");

            if (inputStream == null) {
                throw new NullPointerException("Cannot find resource file input1.json");
            }

            ObjectMapper objectMapper = new ObjectMapper();
            Person person = objectMapper.readValue(inputStream, Person.class);

            System.out.println(person.getName());
            System.out.println("\nKnown For:");
            for (String known : person.getKnownFor()) {
                System.out.println("\t" + known);
            }
            System.out.println("\nAwards:");
            for (Award award : person.getAwards()) {
                System.out.println("\t" + award.getName() + ", " + award.getYear());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
