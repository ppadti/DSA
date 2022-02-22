package Sample_Programs;

public class AsciiValue {
    public static void main(String[] args) {
        // char ch = 'a';
        // System.out.println((int)ch);
        subseqAscii(" ", "abc");

    }
    static void subseqAscii(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseqAscii(p + ch, up.substring(1));
        subseqAscii( p + (int)ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        
    }
}
