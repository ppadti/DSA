package Sample_Programs;

public class SkipString {
    public static void main(String[] args) {
       System.out.println( skipStr( "baccappleabh"));
    }

    static String skipStr( String up){
        if( up.isEmpty()){
            return  " ";
        }

        if (up.startsWith("apple")){
            return skipStr( up.substring(5));
        }
        else{
            return up.charAt(0) + skipStr(up.substring(1));
        }
    }
}
    
