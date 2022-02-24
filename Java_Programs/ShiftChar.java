package Java_Programs;

import java.util.Scanner;

public class ShiftChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.next();
        String s = "";
        shift(s, str1);
        

    }
    static int count = 0;
    static void shift(String p, String str) {
        if (str.isEmpty()) {
            for (int i = 0; i < count; i++) {
                p = p + 'x';
            }
            System.out.println(p);
            return;
        }
    
        char ch = str.charAt(0);
        if ( ch == 'x') {
            count++;
            shift( p, str.substring(1));
        }
        else{
            shift(p + ch, str.substring(1));
        }

    }
}
