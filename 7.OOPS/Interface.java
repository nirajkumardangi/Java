// Interface

interface Animal8 {
    void sound(); //  Abstract method

    void eat(); //  Abstract method
}

class Dog5 implements Animal8 {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats bones");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal8 myDog = new Dog5();
        myDog.sound();
        myDog.eat();
    }
}
