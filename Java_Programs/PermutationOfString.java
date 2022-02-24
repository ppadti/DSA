package Java_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        System.out.println(permutation(" ", str));
    }

    static ArrayList<String> permutation(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i,p.length());

            list.addAll(permutation(f + ch + s, up.substring(1)));   
        }
        list.sort(null);
        return list;
    }
}
