package Java_Programs;

import java.util.Scanner;

public class StringToIntegre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String str = sc.next();
        int num = 0;
        stringToInteger(str,num);

    }

    static void stringToInteger(String s, int num) {
        if (s.isEmpty()) {
            System.out.println(num);
            return;
        }

        int n = s.charAt(0) -'0';
        num = num * 10;
        num += n;
        stringToInteger(s.substring(1),num);
    }
}
