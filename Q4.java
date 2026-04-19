 package strings;

public class Q4 {
    static boolean isPalindrome(String str){
        String clean = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    public static void main(String[] args){
        System.out.println(isPalindrome("Madam"));
    }
}