import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;

public class JsonToJavaConverter {
    public static void main(String[] args) {
        Gson gson = new Gson();

        try (FileReader reader = new FileReader("person.json")) {
            Person person = gson.fromJson(reader, Person.class);
            System.out.println("read from json");
            System.out.println("Deserialized Object: " + person.toString());
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
