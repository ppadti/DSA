package Java_Programs;

import java.util.Scanner;



public class SwapNumbers {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        int num1 = in.nextInt();
        int num2 = in.nextInt();

        System.out.println("Before swap: \n num1:" + num1 + "\n num2 :" + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("After swap: \n num1:" + num1 + "\n num2 :" + num2);
        in.close();

  }
}
