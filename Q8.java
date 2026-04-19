 package strings;

public class Q8 {
    static boolean isNumeric(String str){
        return str.matches("\\d+");
    }

    public static void main(String[] args){
        System.out.println(isNumeric("12345"));
    }
}