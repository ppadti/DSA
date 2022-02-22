package Sample_Programs;

public class SubsetString {
    public static void main(String[] args) {
        Permutation(" ", "abc");
    }

    static void Permutation(String p, String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;

        }

        char ch = up.charAt(0);

        Permutation(p + ch, up.substring(1));
        Permutation(p, up.substring(1));
    }
}
