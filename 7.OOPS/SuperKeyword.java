// super: to call the parent class constructor.
// Superclass
class Animal4 {
    Animal4(String name) {
        System.out.println("Animal constructor: " + name);
    }
}

// Subclass
class Tiger extends Animal4 {
    Tiger(String name) {
        super(name);  // Calls Animal4 constructor
        System.out.println("Tiger constructor: " + name);
    }
}

// Main class to test super keyword
public class SuperKeyword {
    public static void main(String[] args) {
        Tiger myTiger = new Tiger("Dogesh");
    }
}

// Animal constructor: Dogesh
// Tiger constructor: Dogesh
