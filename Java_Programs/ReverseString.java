package Java_Programs;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two string: ");
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(isReverse(str1, str2));

    }

    static boolean isReverse(String s1, String s2) {
        String str = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            char ch = s1.charAt(i);
            str = str + ch;
        }
        if ( str.equals(s2)) {
            return true;
        }
        else
            return false;

    }

}
