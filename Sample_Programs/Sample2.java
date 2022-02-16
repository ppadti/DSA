package Sample_Programs;

import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        

        //Case check
        System.out.println("****************************");
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z')
        {
            System.out.println("Lowercase");
        }
        else
        {
            System.out.println("Uppercase");
        }

        //sum of Fibonacci number
        System.out.println("****************************");
        System.out.println(" Fibonacci numbers");
        int n =in.nextInt();

        int p=0;
        int i=1;
          int count = 2;
        while (count <= n)
        {
                int temp = i;
                i = i + p;
                p = temp;
                count++;

        }
            System.out.println(i);


         //count number
         System.out.println("****************************");
         System.out.println(" count numbers");
        System.out.println("Enter a number");
         int num = in.nextInt();
         System.out.println(" Enter a digit to be count");
         int m = in.nextInt();
         int j=0; 
         while (num > 0)
         {
             int rem = num % 10;
             if (rem == m)
             {
                 j++;

             }
             num = num / 10;

         }

         System.out.println(j);





        //Reverse a number
        System.out.println("****************************");
        System.out.println("Reverse a numbers");


        System.out.println("Enter a number:");

        int num1 = in.nextInt();
        int sum =0;
        int temp = num1;

        while (num1>0)
        {
            int rem = num1 % 10;
            sum = (sum *10) + rem;
            num1 = num1/10;
        }
        System.out.println("Reverse of " + temp+  " is : " + sum);




        //Calculator 
        System.out.println("****************************");
        System.out.println("Calculator");
        int ans = 0;

        while (true)
        {
            System.out.println("Enter the operator:");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                System.out.println("Enter two numbers:");
                int number1 = in.nextInt();
                int number2 = in.nextInt();
                if (op == '+')
                ans = number1 + number2;
                if (op == '-')
                ans = number1 - number2;
                if (op == '*')
                ans = number1 * number2;
                if (op == '/'){
                    if (number2  != 0 )
                        ans = number1 / number2;
                }
                if (op == '%')
                ans = number1 % number2;
            }
            else if ( op == 'x' || op == 'X')
            {
                break;
            }
            else{
                System.out.println("Invalid operation");
            } 
            System.out.println(ans);
            }
        
           
            
    


           

    }
    
}
