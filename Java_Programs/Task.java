package Java_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Task {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str = "";
        String s1 = "exit";
        while (true) {
            System.out.println("Enter a string or a number");
            str = sc.next();
            if (str.equalsIgnoreCase(s1))
                break;
            if (isNumber(str))
                numberInput(str);
            else
                stringInput(str);
        }
    }

    static boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
        }
        return true;
    }

    static void numberInput(String s) {
        int num = Integer.parseInt(s);
        System.out.println("Enter operation:");
        System.out.println(" 1. Reverse the number\n 2. Check for Palindrome\n 3. Armstrong number\n");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                reverseNumber(num);
                break;
            case 2:
                palindrome(num);
                break;
            case 3:
                armstrong(num);
                break;
            default:
                System.out.println("Invalid Operations");
        }
    }

    static void reverseNumber(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum = (sum * 10) + rem;
            num = num / 10;
        }
        System.out.println("Reverse of " + temp + " is " + sum);
    }

    static void palindrome(int num1) {
        int temp = num1;
        int sum = 0;

        while (num1 > 0) {
            int rem = num1 % 10;
            sum = (sum * 10) + rem;
            num1 = num1 / 10;
        }
        if (sum == temp) {
            System.out.println(temp + " is palindrome");
        } else
            System.out.println(temp + " is not palindrome");
    }

    static void armstrong(int num) {
        int sum = 0;
        int temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum = sum + (rem * rem * rem);
            num = num / 10;
        }
        if (temp == sum) {

            System.out.println(temp + " is armstrong number");
        } else
            System.out.println(temp + " is not a armstrong number");
    }

    static String s1;

    static void stringInput(String s) {
        System.out.println("Enter operation:");
        System.out.println(
                " 1. Subsequence of a string\n 2. Permutation of a string\n 3. Palindromic partition of a string\n");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Subsequence of " + s + " are: ");
                subSequence(" ", s);
                break;
            case 2:
                System.out.println("Permutation of " + s + " are: ");
                System.out.println(permutation(" ", s));
                break;
            case 3:
                System.out.println("Palindromic partitions of " + s + " are: ");
                s1 = s;
                palindromicPartition(" ", s);
                break;
            default:
                System.out.println("Invalid Operations");
        }
    }

    static void subSequence(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSequence(p, up.substring(1));
        subSequence(p + ch, up.substring(1));
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
            String s = p.substring(i, p.length());

            list.addAll(permutation(f + ch + s, up.substring(1)));
        }
        list.sort(null);
        return list;
    }

   static void palindromicPartition(String p, String up) {
        if (up.isEmpty())
            System.out.println(p);

        for (int i = 0; i < up.length(); i++) {
            String f = up.substring(0, i + 1);
            String s = up.substring(i + 1);
            if (isPalindrome(f)) {
                palindromicPartition(p + "[" + f + "]", s);

            }
        }
    }

    static boolean isPalindrome(String str) {
        str = str.replaceAll(" ", "");
        if (str == null || str.length() == 0 || str == " ") {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - i - 1);
            if (start != end)
                return false;
        }
        return true;

    }
}
