class Student {
    String name;
    int rollNo;
    void display() {
        System.out.println("Name: " + name + ", Roll: " + rollNo);
    }
}

public class StudentClass {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Alice";
        s.rollNo = 101;
        s.display();
    }
}
