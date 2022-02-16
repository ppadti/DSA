package Sample_Programs;

import java.util.Scanner;



public class Sample{
    public static void main(String[] args) {



        //Scanner class
        Scanner in =  new Scanner(System.in);


        //Print statement
        System.out.println("******************************************");
        System.out.println("Hello world program demo");

        System.out.println("hello world");



        //Data types
        System.out.println("******************************************");
        System.out.println("Data types demo");

        System.out.println("Enter a name");
        String name = in.next();
        System.out.println("Name is " + name);
        
        System.out.println("Enter a Roll number:");
        int rollno = in.nextInt();
        System.out.println("Roll no is" + rollno);

        System.out.println("Enter marks:");
        float marks = in.nextFloat();
        System.out.println("Marks is " + marks);


        //find sum of two integer
        System.out.println("******************************************");
        System.out.println("finding sum of two integer");
        System.out.println("Enter two numbers;");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("Sum is; " + sum);


        //type casting
        System.out.println("******************************************");
        System.out.println("Type casting Demo");

        int num = (int)(67.87);
        System.out.println(num);

        //autmatic type promotion in expression
        byte a = 40;
        byte b = 50;
        byte c = 100;

        int d = (a*b) / c;
        System.out.println(d);


        //ASCII conversion
        int number = 'A';
        System.out.println(number);



        //if condition 
        System.out.println("******************************************");
        System.out.println("if statment demo");

        int salary=25400;
        if(salary>10000)
        {
            salary = salary + 2000;
        }
        else
        {
            salary = salary + 1000;
        }
        System.out.println(salary);



        //if-else statement
        System.out.println("******************************************");
        System.out.println("if-else statement Demo");

        if(salary > 10000)
        {
            salary += 2000;

        }
        else if(salary > 20000)
        {
            salary += 3000;
        }
        else{
            salary += 1000;
        }
        System.out.println(salary);




    //print number from 1 to 5
    System.out.println("******************************************");
    System.out.println("for-loop demo (print number from 1 to 5) ");

    for (int i = 1; i <= 5; i++)
    {
        System.out.println(i);
    }



    //print number from 1 to n
    System.out.println("******************************************");
    System.out.println("for-loop demo (print number from 1 to n)");

    
    System.out.println("Enter a number:");
    int n = in.nextInt();

    for (int i = 1; i <= n; i++)
    {
        System.out.println(i + " ");
    }




    // while loop demo
    System.out.println("******************************************");
    System.out.println("While-loop demo (print number from 1 to 5");
    
    int n1 = 1;

    while (n1 <= 5)
    {
        System.out.println(n1);
        n1 += 1;

    }



    // do-while loop demo
    System.out.println("******************************************");
    System.out.println("do-while loop demo (print number from 1 to 5)");
    int m = 1;
    do {
        System.out.println(m);
        m++;
    }while(m <= 5);
    





     



    }
}