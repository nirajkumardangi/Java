// Superclass
class Animal3 {
    void eat() {
        System.out.println("Animal eats.");
    }
}

// Subclass
class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Subclass
class Cat extends Animal3 {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Main class to test hierarchical inheritance
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.eat();
        myCat.meow();

        Dog3 myDog = new Dog3();
        myDog.eat();
        myDog.bark();
    }
}

// Animal eats.
// Cat meows.
// Animal eats.
// Dog barks.