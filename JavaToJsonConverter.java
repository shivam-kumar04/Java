import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JavaToJsonConverter {

    public static void main(String[] args) {
        List<String> hobbiesList = Arrays.asList("Reading", "Swimming", "Gaming");
        Person person = new Person("Alice", 30, 1500.50, hobbiesList);
        Gson gson = new GsonBuilder().create();
        try (FileWriter writer = new FileWriter("person.json")) {
            gson.toJson(person, writer);
            System.out.println("converted object to json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
