// File: JavaToJsonConverter.java
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JavaToJsonConverter {

    public static void main(String[] args) {
        // 1. Create a Java object
        List<String> hobbiesList = Arrays.asList("Reading", "Swimming", "Gaming");
        Person person = new Person("Alice", 30, 1500.50, hobbiesList);

        // 2. Create a Gson instance with pretty printing
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // 3. Serialize the Java object to a JSON file
        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(person, writer);
            System.out.println("✅ Successfully converted Person object to person.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
