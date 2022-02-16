package Java_Programs;

import java.util.Scanner;

public class Factorial {

    static int fact(int n)
    {
        if (n ==0)
        {
            return 1;
        }
        else{
            return (n * fact(n-1));
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num = in.nextInt();
        int result = fact(num);
        System.out.println("Factorial of " + num + " is :" + result);
        in.close();
    }
}
