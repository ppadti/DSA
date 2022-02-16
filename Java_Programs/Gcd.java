package Java_Programs;

import java.util.Scanner;

public class Gcd {
    static int FindGCD(int a, int b){
        if (b==0)
            return a;
        return (FindGCD(b, a%b));
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two number:");

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int result = FindGCD(num1, num2);
        System.out.println("GCD of" + num1 + "and" + num2 + "is:" + result);
        in.close();
    }
}
