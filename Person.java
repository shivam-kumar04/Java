// File: Person.java
import java.util.List;

public class Person {
    private String name;
    private int age;
    private double amount;
    private List<String> hobbies;

    // A no-argument constructor is good practice for some libraries, though Gson doesn't always need it.
    public Person() {}

    // Constructor to initialize a new Person object
    public Person(String name, int age, double amount, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.hobbies = hobbies;
    }

    // Getters to access the private fields
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    
    public double getAmount() {
        return amount;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
               "name='" + name + '\'' +
               ", age=" + age +
               ", amount=" + amount +
               ", hobbies=" + hobbies +
               '}';
    }
}
