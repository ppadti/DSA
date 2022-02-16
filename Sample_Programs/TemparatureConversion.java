package Sample_Programs;

import java.util.Scanner;

public class TemparatureConversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter temp in C:");
        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;
        System.out.println("Teamparatire in F : " + tempF);
        
        
    }

        
    
}
