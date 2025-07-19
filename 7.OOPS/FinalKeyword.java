final class Animal6 {
    public final void sound() {
        System.out.println("Animal makes sound");
    }

    public void showAge() {
        final int AGE = 5;
        System.out.println("Animal's age: " + AGE);
        // AGE = 10; // Error: cannot assign to final variable
    }
}

//class Dog extends Animal6 { // Error: Cannot extend final class
//    public void sound() {   // Error: Cannot override final method
//        System.out.println("Dog barks");
//    }
//}

public class FinalKeyword {
    public static void main(String[] args) {
        Animal6 animal = new Animal6();
        animal.sound();
        animal.showAge();
    }
}
