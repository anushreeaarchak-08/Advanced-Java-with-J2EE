 package strings;

public class Q7 {
    static String truncate(String str, int length){
        return str.length() > length ? str.substring(0,length) + "..." : str;
    }

    public static void main(String[] args){
        System.out.println(truncate("HelloJavaWorld",5));
    }
}