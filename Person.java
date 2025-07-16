import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private double amount;
    private List<String> hobbies;


    public Person(String name, int age, double amount, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.hobbies = hobbies;
    }
    
    public String getName() { return name; }
    public int getAge() { return age; }
    public List<String> getHobbies() { return hobbies; }


    public static void main(String[] args) {
        List<String> hobbiesList = Arrays.asList("Reading", "Swimming", "Gaming");
        Person person = new Person("Alice", 30, 1500.5, hobbiesList);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(person);

        try (FileWriter writer = new FileWriter("person.json")) {
            writer.write(jsonOutput);
            System.out.println("JSON file created successfully using Gson.");
            System.out.println("--- Generated JSON ---");
            System.out.println(jsonOutput);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\n--- Reading from JSON file ---");
        try (FileReader reader = new FileReader("person.json")) {
            // Read the file and convert the JSON back into a Person object
            Person personFromFile = gson.fromJson(reader, Person.class);

            System.out.println("JSON file read and parsed successfully.");
            System.out.println("Name: " + personFromFile.getName());
            System.out.println("Age: " + personFromFile.getAge());
            System.out.println("Hobbies: " + personFromFile.getHobbies());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
