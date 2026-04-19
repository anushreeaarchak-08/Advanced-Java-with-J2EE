 package strings;

import java.util.Random;

public class Q9 {
    static String generateRandomString(int length){
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random r = new Random();
        String result = "";
        for(int i=0;i<length;i++)
            result += chars.charAt(r.nextInt(chars.length()));
        return result;
    }

    public static void main(String[] args){
        System.out.println(generateRandomString(5));
    }
}