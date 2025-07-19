// Static Method: static methods are methods that belong to the class rather than an instance of the class.
// This means you don’t need to create an object of the class to call a static method—you can call it directly using the class name

class Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class StaticMethod {
    public static void main(String[] args) {
        // Call static method without creating an object
        int sum = Calculator.add(10, 20);
        System.out.println("Sum: " + sum);

        int product = Calculator.multiply(10, 20);
        System.out.println("Product: " + product);
    }
}