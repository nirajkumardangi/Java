// GrandParent
class Animal2 {
    void eat() {
        System.out.println("Animal eats.");
    }
}

// Parent
class Dog2 extends Animal2 {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Child
class Puppy extends Dog2 {
    void weep() {
        System.out.println("Puppy weeps.");
    }
}

// Main class to test multilevel inheritance
public class MultilevelInheritance {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();
        myPuppy.bark();
        myPuppy.weep();
    }
}

// Animal eats.
// Dog barks.
// Puppy weeps.