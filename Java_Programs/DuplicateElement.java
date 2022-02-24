package Java_Programs;


public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,4,3,7,4,2};
       
        
        for (int i = 0; i < arr.length; i++)
        {
          for ( int j = i+1; j < arr.length; j++){
            if (arr[i] == (arr[j])){
                System.out.println(arr[j]);
            }
        }
            
        }

    }
}
