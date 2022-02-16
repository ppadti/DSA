package Java_Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");

        int num1 = in.nextInt();
        int temp = num1;
        int sum =0;

        while (num1>0)
        {
            int rem = num1 % 10;
            sum = (sum *10) + rem;
            num1 = num1/10;
        }

        if( temp == sum)
        System.out.println(temp + " is a palindrome");
        else
        System.out.println(temp + " is not a palindome");
        in.close();
    }
    
}
