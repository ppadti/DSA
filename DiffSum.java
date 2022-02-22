package Sample_Programs;

import java.util.Arrays;

public class DiffSum {
    public static void main(String[] args) {
        int[] arr1 = {6,8,7,12};
        int[] arr2 = {3,7,6,10};

        int s = 0;
        int ans  = diff(arr1,arr2,s);
        System.out.println(ans);
        
    }

    static int diff(int[] arr1, int[] arr2,int sum){
        if (arr1.length != arr2.length)
            return sum; 
        if (arr1.length == 0)
            return sum;
        sum = sum + (arr1[0] - arr2[0]);
return diff(Arrays.copyOfRange(arr1, 1, arr1.length),Arrays.copyOfRange(arr2, 1, arr2.length),sum);
    }
}
