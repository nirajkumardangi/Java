// function: blocks of code designed to perform a specific task.

public class Functions {
    public static void main(String[] args) {
        greet(); // function call without argument.
        int total = add(10, 20); // function call with arguments.
        System.out.println("Total: " + total);
    }

    // method definition without parameter and return value.
    public static void greet() {
        System.out.println("Hello World!");
    }

    // method definition with parameter and return value.
    public static int add(int a, int b){
        return a + b;
    }
}
