package Java_Programs;

public class UnionandIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6,7};
        int[] arr2 = {1,2,4,6,8,9,11,15};

        System.out.println("Union of array:");
        findUnion(arr1,arr2);
        System.out.println();
        System.out.println("Intersection of arrays:");
        findIntersection(arr1, arr2); 
        System.out.println();

        
        
    }

    static void findUnion(int[] arr1, int[]arr2){
        int i = 0, j = 0;
        while ( i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                System.out.print(" " + arr1[i]);
                i++;
            }
            else if (arr1[i] > arr2[j]){
                System.out.print(" " + arr2[j]);
                j++;
            }
            else {
                System.out.print(" " + arr1[i]);
                i++;
                j++;
            }

        }

        while( i < arr1.length){
            System.out.print(" " + arr1[i]);
            i++;
        }
        while(j < arr2.length){
            System.out.print(" " + arr2[j]);
            j++;
        }

    }

    static void findIntersection(int[] arr1, int[] arr2){
        int i = 0, j = 0;
        while ( i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                i++;
            }
            else if (arr1[i] > arr2[j]){  
                j++;
            }
            else {
                System.out.print(" " + arr1[i]);
                i++;
                j++;
            }

        }

    }
}
