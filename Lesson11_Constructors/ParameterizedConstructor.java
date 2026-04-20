class Person {
    String name;
    Person(String n) {
        name = n;
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Person p = new Person("Bob");
        System.out.println("Person: " + p.name);
    }
}
