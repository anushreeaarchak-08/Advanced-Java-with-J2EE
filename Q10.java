 package strings;

public class Q10 {
    static int countWords(String str){
        return str.trim().split("\\s+").length;
    }

    public static void main(String[] args){
        System.out.println(countWords("Hello Java World"));
    }
}