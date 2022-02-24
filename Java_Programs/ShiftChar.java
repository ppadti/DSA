package Java_Programs;

import java.util.Scanner;

public class ShiftChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.next();
        String s = "";
        System.out.println(shift(s, str1));

    }
    static int count = 0;
    static String shift(String p, String str) {
        if (str.isEmpty()) {
            for (int i = 0; i < count; i++) {
                p = p + 'x';
            }
            return p;
        }
    
        char ch = str.charAt(0);
        if ( ch == 'x') {
            count++;
            return shift( p, str.substring(1));
        }
        else {
            return shift(p + ch, str.substring(1));
        }

    }
}
