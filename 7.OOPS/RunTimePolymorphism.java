//Method Overriding means redefining a method from the parent class in the child class.

// Run-Time Polymorphism (Method Overriding)

class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
    }
}

class Car1 extends Vehicle {
    @Override
    void move() {
        System.out.println("Car is moving on four wheels");
    }
}

class Bicycle extends Vehicle {
    @Override
    void move() {
        System.out.println("Bicycle is moving on two wheels");
    }
}

public class RunTimePolymorphism {
    public static void main(String[] args) {
        Vehicle v;
        v = new Car1();
        v.move(); // Output: Car is moving on four wheels.

        v = new Bicycle();
        v.move(); // Output: Bicycle is moving on two wheels.

        v = new Vehicle();
        v.move(); // Output: Vehicle is moving.
    }
}
