 package strings;

public class Q2 {
    static int countOccurrences(String main, String sub){
        int count = 0, index = 0;
        while((index = main.indexOf(sub, index)) != -1){
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(countOccurrences("hello hello", "hello"));
    }
}