 package strings;

public class Q5 {
    static String removeWhitespace(String str){
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args){
        System.out.println(removeWhitespace("Hello World"));
    }
}