// Superclass (Parent)
class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Subclass (Child)
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main class to test inheritance
public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.name = "Dogesh";

        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Defined in Dog
    }
}

// Dogesh is eating.
// Dogesh is sleeping.
// Dogesh is barking.