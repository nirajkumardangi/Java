public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 3; // 5 = 0101, 3 = 0011 in binary
        System.out.println("a & b: " + (a & b)); // 1
        System.out.println("a | b: " + (a | b)); // 7
        System.out.println("a ^ b: " + (a ^ b)); // 6
        System.out.println("~a: " + (~a)); // -6
        System.out.println("a << 2: " + (a << 2)); // 20
        System.out.println("a >> 2: " + (a >> 2)); // 1
    }
}
