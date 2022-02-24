package Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegerSubset {
    public static void main(String[] args) {
        int[] arr = {1,2};
        List<Integer> s = new ArrayList<>();
        List<List<Integer>> ans = subset(s,arr);
        for (List<Integer> list :ans) {
             System.out.println(list);
         }
    }

    static List<List<Integer>> subset(List<Integer> s,int[] arr) {
        if (arr.length == 0) {
            List<List<Integer>> list = new ArrayList<>();
            list.add(new ArrayList<>(s));
            return list;
        }
        s.add(arr[0]);
        List<List<Integer>> left = subset(s, Arrays.copyOfRange(arr, 1,arr.length));
        s.remove(s.size()-1);
        List<List<Integer>> right = subset(s, Arrays.copyOfRange(arr, 1,arr.length));
        left.addAll(right);

        return left;
    }
}
