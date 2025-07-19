// Method Overloading means defining multiple methods with the same name within a class, but with different parameters.

// Compile-Time Polymorphism (Method Overloading)
public class CompileTimePolymorphism {

    // method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // method to add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // method to add two decimal numbers
    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        CompileTimePolymorphism calc = new CompileTimePolymorphism();

        System.out.println(calc.add(5, 10));         // Output: 15 (int, int)
        System.out.println(calc.add(5, 10, 15));  // Output: 30 (int, int, int)
        System.out.println(calc.add(5.5, 10.2));     // Output: 15.7 (double, double)
    }
}
