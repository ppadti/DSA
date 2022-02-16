package Java_Programs;

import java.util.Scanner;

public class PrimeNumber {

    static boolean isPrime(int num1){
        if (num1 <= 1)
        {
            return false;
        }
        for ( int i=2; i <= Math.sqrt(num1); i++){
            if (num1 % i == 0 ){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a numbers:");

        int num1 = in.nextInt();
        if(isPrime(num1))
        {
            System.out.println(num1 + " is prime number");
        }
        else{
            System.out.println(num1 + " is not a prime number");
        }
        
        in.close();
        

    }
    
}
