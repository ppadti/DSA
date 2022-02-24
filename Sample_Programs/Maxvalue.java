package Sample_Programs;

public class Maxvalue {
    public static void main(String[] args) {
        int[] arr = {2,3,2,59,18};
        System.out.println(maxrange(arr,0,arr.length));

    }

    static int maxrange(int[] ar, int start, int end)
    {
        int maxval = ar[start];
        int idx=0;
        for (int i = start; i < end; i++)
        {
            if (ar[i] > maxval){
            maxval = ar[i];
        
            idx=i;
        }
    }
        
        return idx;
    }
}

