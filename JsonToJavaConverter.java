// File: JsonToJavaConverter.java
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class JsonToJavaConverter {

    public static void main(String[] args) {
        // 1. Create a Gson instance
        Gson gson = new Gson();

        // 2. Deserialize the JSON file back to a Java object
        try (FileReader reader = new FileReader("person.json")) {
            Person person = gson.fromJson(reader, Person.class);
            System.out.println("✅ Successfully read from person.json");
            System.out.println("Deserialized Object: " + person.toString());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
