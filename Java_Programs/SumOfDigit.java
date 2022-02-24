package Java_Programs;

import java.security.DigestException;
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        String str = sc.next();
    
        int n = Integer.parseInt(str);

        System.out.println(digit(n));
    }

    static int digit(int num) {
        if ( num == 0) {
            return 0;
        }

        return num%10 + digit(num/10);
        }
    }
