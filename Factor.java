package Sample_Programs;

import java.util.ArrayList;

public class Factor {
    public static void main(String[] args) {
        fact1(20);
        System.out.println();
        fact2(36);
        System.out.println();
        fact3(36);
    }

    //brute force method
    static void fact1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i + " ");
            }
        }
    }

    static void fact2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i != i)
                    System.out.print(i + " " + n/i + " ");
                else
                    System.out.println(i + " ");
            }
        }
    }

    static void fact3(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n/i != i){
                    System.out.print(i + " " );
                    list.add(n/i);
                }
                else{
                    System.out.print(i + " ");
                }
            }
        }

        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
            
        }
    }

}
