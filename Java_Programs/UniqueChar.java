package Java_Programs;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        uniqueChar(" ", str);
    }

    static void uniqueChar(String p,String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (p.contains(Character.toString(ch))) {
            uniqueChar(p, up.substring(1));
        }
        else{
            uniqueChar(p + ch, up.substring(1));
        }


    }
}
