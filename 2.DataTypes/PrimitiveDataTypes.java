public class PrimitiveDataTypes {
    public static void main(String[] args) {
        byte b = 100;                // 1 byte
        short s = 10000;             // 2 bytes
        int i = 100000;              // 4 bytes
        long l = 10000000000L;       // 8 bytes
        float f = 5.75f;             // 4 bytes
        double d = 19.99;            // 8 bytes
        char c = 'A';                // 2 bytes
        boolean bool = true;         // 1 bit

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);
    }
}