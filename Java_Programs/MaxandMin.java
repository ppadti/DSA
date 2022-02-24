package Java_Programs;

public class MaxandMin {
    public static void main(String[] args) {
        int[] arr = {2,3,2,59,18,0};
        System.out.println(maxrange(arr,0,arr.length));
        System.out.println(minrange(arr,0,arr.length));
    }

    static int maxrange(int[] ar, int start, int end)
    {
        int maxval = ar[start];
        for (int i = start; i < end; i++)
        {
            if (ar[i] > maxval){
            maxval = ar[i];
        
         
        }
    }
        
        return maxval;
    }


    static int minrange(int[] ar, int start, int end)
    {
        int minval = ar[start];
        for (int i = start; i < end; i++)
        {
            if (ar[i] < minval){
            minval = ar[i];
        
         
        }
    }
        
        return minval;
    }



}
