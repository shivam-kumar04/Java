import java.util.List;

public class Person {
    private String name;
    private int age;
    private double amount;
    private List<String> hobbies;
    public Person() {}

    public Person(String name, int age, double amount, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.amount = amount;
        this.hobbies = hobbies;
    }

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
