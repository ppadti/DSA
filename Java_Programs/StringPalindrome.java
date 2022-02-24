package Java_Programs;

import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor.AbortPolicy;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.next();
        System.err.println(isPalindrome(str1));
    }

    static boolean isPalindrome(String s1) {
        String s = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            char ch = s1.charAt(i);
            s = s + ch;
        }
        if (s1.equals(s)) {
            return true;
        }
        return false; 
    }
}
