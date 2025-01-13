// basic option-1 -->
/*public class CharToASCII {
    public static void main(String[] args) {
        char ch = 'U';
        int ascii = ch;
        System.out.println("Character: " + ch);
        System.out.println("ASCII value of " + ch + " is " + ascii);
    }
}*/

// by casting method-2 -->
/*public class CharToASCII {
    public static void main(String[] args) {
        char ch = 'U';
        int ascii = (int) ch;
        System.out.println("ASCII value of " + ch + " is " + ascii);
    }
}*

 */
// getting character of an ASCII -->
public class CharToASCII {
    public static void main(String[] args) {
        int value = 85;
        char c = (char) value;
        System.out.println("ASCII value of " + value + " is " + c);
    }
}

