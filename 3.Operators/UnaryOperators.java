public class UnaryOperators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a: " + a); // 10
        System.out.println("++a: " + (++a)); // 11
        System.out.println("a++: " + (a++)); // 11
        System.out.println("a: " + a); // 12
        System.out.println("--a: " + (--a)); // 11
        System.out.println("a--: " + (a--)); // 11
        System.out.println("a: " + a); // 10
    }
}
