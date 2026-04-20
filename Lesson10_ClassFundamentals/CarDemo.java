class Car {
    String model;
}

public class CarDemo {
    public static void main(String[] args) {
        Car car1 = new Car(); car1.model = "Sedan";
        Car car2 = new Car(); car2.model = "SUV";
        System.out.println(car1.model + " vs " + car2.model);
    }
}
