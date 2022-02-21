package Sample_Programs;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {2,3,2,59,18};
        int start = 0;
        int end = arr.length-1;

        while (start < end)
        {
            swap(arr, start,end);
            start++;
            end--;
        }

        System.out.println(Arrays.toString(arr));
    }
    
    static void swap(int[] ar, int st, int end)
    {
        int temp = ar[st];
        ar[st] = ar[end];
        ar[end] = temp;
    }
}
