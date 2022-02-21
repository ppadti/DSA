package Java_Programs;



public class MissingElement {
    public static void main(String[] args) {
        
    
    int[] arr = {2,3,4,1,5,7};
    int size = arr.length +1;
    int sum = 0;

    for (int i = 0; i < arr.length; i++)
    {
        sum = sum + arr[i];

    }

    int sumofnaturalnumber = (size * (size +1) /2);
    System.out.println(sumofnaturalnumber-sum);

    }
}
