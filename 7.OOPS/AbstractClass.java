// Abstract Class

abstract class Animal7 {
    // Abstract method
    abstract void sound();

    // Concreate method
    void sleep() {
        System.out.println("This animal sleep");
    }
}

class Dog4 extends Animal7 {
    @Override
    void sound() {
        System.out.println("Dog barks.");
    }
}

class Cat1 extends Animal7 {
    @Override
    void sound() {
        System.out.println("Cat meows.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal7 myDog = new Dog4();
        myDog.sound();  // Dog barks.
        myDog.sleep();  // This animal sleep

        Animal7 myCat = new Cat1();
        myCat.sound();  // Cat meows.
        myCat.sleep();  // This animal sleep
    }
}
