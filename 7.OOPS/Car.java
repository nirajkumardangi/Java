// This is the blueprint (Class) for any Car
public class Car {

    // --- Attributes / Fields / Instance Variables ---
    // These define WHAT a Car HAS.
    String color;
    String model;
    int currentSpeed;

    // --- Constructor ---
    // This is a special method used to CREATE a new Car object.
    // It sets the initial state.
    public Car(String carColor, String carModel) {
        System.out.println("Building a new " + carColor + " " + carModel + "!");
        this.color = carColor; // 'this.color' refers to the object's color,
        // 'carColor' is the value passed in.
        this.model = carModel;
        this.currentSpeed = 0; // Every new car starts at 0 speed.
    }

    // --- Methods / Behaviors ---
    // These define WHAT a Car can DO.

    // Method to make the car speed up
    public void accelerate(int speedIncrease) {
        this.currentSpeed = this.currentSpeed + speedIncrease;
        System.out.println(this.model + " is accelerating. Current speed: " + this.currentSpeed + " km/h.");
    }

    // Method to make the car slow down
    public void brake() {
        this.currentSpeed = 0;
        System.out.println(this.model + " applied brakes. Current speed: " + this.currentSpeed + " km/h.");
    }

    // Method to show the car's details
    public void displayInfo() {
        System.out.println("--- Car Details ---");
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Speed: " + this.currentSpeed + " km/h");
        System.out.println("--------------------");
    }


    // making objects of this Car class
    public static void main(String[] args) {
        // --- Creating Objects (Instances) ---
        // We use the 'new' keyword and the Constructor to create an object.

        // Create car 1 using the Car blueprint
        Car myFirstCar = new Car("Red", "Maruti Swift");

        // Create car 2 using the same Car blueprint
        Car mySecondCar = new Car("Blue", "Tata Nexon");

        System.out.println("\nWe have built our cars. Let's use them!");

        // --- Interacting with Objects ---
        // We use the dot (.) operator to access methods (and sometimes fields).

        // Interact with the first car
        myFirstCar.displayInfo(); // Show its initial state
        myFirstCar.accelerate(50); // Make it speed up
        myFirstCar.displayInfo(); // Show its new state

        System.out.println("---"); // Separator

        // Interact with the second car
        mySecondCar.displayInfo(); // Show its initial state
        mySecondCar.accelerate(30); // It speeds up independently
        mySecondCar.accelerate(40); // Speeds up again
        mySecondCar.brake();      // It brakes
        mySecondCar.displayInfo(); // Show its final state

        // Notice that myFirstCar's speed is still 50.
        // Each object maintains its OWN state.
        System.out.println("\nChecking first car's speed again:");
        myFirstCar.displayInfo();
    }
}
