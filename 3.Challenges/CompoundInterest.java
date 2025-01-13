public class CompoundInterest {
    public static void main(String[] args) {
        // 6.Create a program to calculate Compound interest. Compound Interest = P(1 + R/100)t
        float p = 10000;
        float r = 12;
        float t = 10;
        System.out.println("Result of compound interest = " + (p * (1 + r / 100) * t));
    }
}
