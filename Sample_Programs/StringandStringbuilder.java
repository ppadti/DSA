package Sample_Programs;

import java.util.Arrays;

public class StringandStringbuilder {
    public static void main(String[] args) {
        
        //String Comparison
        String a = "Java";
        String b = "Java";
        System.out.println(a ==b);


        String c = new String("Java");
        String d = new String("Java");
        System.out.println(c == d);
        System.out.println(c.equals(d));

        //output
        System.out.println(56);
        System.out.println("Java");
        System.out.println(new int[] {1,2,3,4});  
        System.out.println(Arrays.toString( new int[] {1,2,3,4})); 


        String series = " ";
        for (int i = 0; i < 26; i++){
          char ch = (char)('a' + i);
          series = series + ch;        
        }
        System.out.println(series);


        //using string builder
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++){
          char ch = (char)('a' + i);
          builder.append(ch);      
        }
        System.out.println(builder.toString());
    
    }
}
