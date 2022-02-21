package Sample_Programs;

import java.util.Arrays;

public class ReverseusingRecursion {
    static int[] arr = { 3,1,7,4,9};
    public static void main(String[] args) {
        //System.out.println(rev(21,2));
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //  static int rev(int n, int arg)
    //  {
    //     if (n%10 == n)
    //         return n;
    //     return (int) ((n%10) * Math.pow(10, arg-1) + rev(n/10, arg-1));
    //  }
    


    
    
}
