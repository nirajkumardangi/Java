// Superclass
class Animal1 {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Subclass
class Dog1 extends Animal1 {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

// Main class to test single inheritance
public class SingleInheritance {
    public static void main(String[] args) {
        Dog1 myDog = new Dog1();
        myDog.eat();
        myDog.bark();
    }
}

// Animal is eating.
// Dog is barking.
