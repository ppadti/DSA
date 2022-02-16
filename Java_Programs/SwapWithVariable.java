package Java_Programs;

import java.util.Arrays;

public class SwapWithVariable {
    public static void main(String[] args) {
        
        int[] arr = {2,3,2,59,18};
        swap(arr,0,3);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] ar, int st, int end)
    {
        int temp = ar[st];
        ar[st] = ar[end];
        ar[end] = temp;
    }
}
