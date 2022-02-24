package Java_Programs;

import java.util.Arrays;

public class SortZerosandOnes {
    public static void main(String[] args) {
        int[] arr = {2,2,1,2,0,0,2,2,1,0,1,1,2};
        int c_one = 0;
        int c_two = 0;
        int c_zero = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                c_zero++;
            }
            else if( arr[i] == 1){
                c_one++;
            }
            else {
                c_two++;
            }
        }
        for (int i = 0; i < c_zero; i++){
            arr[i] = 0;
        }
        for (int i = c_zero; i < (c_zero+c_one); i++){
            arr[i] = 1;
        }
        for (int i = (c_zero+c_one); i < (c_zero+c_one + c_two); i++){
            arr[i] = 2;
        }
        System.out.println(Arrays.toString(arr));
    }
}
