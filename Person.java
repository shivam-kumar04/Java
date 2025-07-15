import java.io.FileWriter;
import java.io.IOException;

public class Person {
    private String name;
    private int age;
    private double amount;
    private String[] hobbies;

    public Person(String name, int age, double amount, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.hobbies = hobbies;
    }

    // Manually build a JSON representation of this object
    public String toJson() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("\"name\": \"").append(name).append("\",\n");
        sb.append("\"age\": ").append(age).append(",\n");
        sb.append("\"amount\": ").append(amount).append(",\n");
        sb.append("\"hobbies\": [");
        for (int i = 0; i < hobbies.length; i++) {
            sb.append("\"").append(hobbies[i]).append("\"");
            if (i < hobbies.length - 1) sb.append(", ");
        }
        sb.append("]\n}");
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] hobbies = {"Reading", "Swimming", "Gaming"};
        Person person = new Person("Alice", 30, 1500.5, hobbies);

        String json = person.toJson();

        // Writing the JSON string to a file manually
        try (FileWriter file = new FileWriter("person.json")) {
            file.write(json);
            System.out.println("JSON file created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
