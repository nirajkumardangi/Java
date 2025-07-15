// super: to call the parent class method and attribute.
// Superclass
class Animal5 {
    String name = "Animal";

    void sound() {
        System.out.println("Animal make sound.");
    }
}

// Subclass
class Goat extends Animal5 {
    String name = "Goat";

    void printName() {
        System.out.println(name); // Goat
        System.out.println(super.name); // Animal
    }

    //    @Override
    void sound() {
        super.sound();
        System.out.println("Goat make sound mee me.");
    }
}

public class SuperKeyword1 {
    public static void main(String[] args) {
        Goat myGoat = new Goat();
        myGoat.sound();
        myGoat.printName();
    }
}

// Animal make sound.
// Goat make sound mee me.
// Goat
// Animal