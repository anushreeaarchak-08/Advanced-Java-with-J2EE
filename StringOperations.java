 // 2a: String Operations Demo
package strings;

public class StringOperations {
    public static void main(String[] args) {

        String str = " Hello Java World ";

        System.out.println("Original String: " + str);

        // Length and char access
        System.out.println("Length: " + str.length());
        System.out.println("Character at index 1: " + str.charAt(1));

        // Comparison
        String str2 = "Hello Java World";
        System.out.println("Equals: " + str.trim().equals(str2));

        // Searching
        System.out.println("Contains 'Java': " + str.contains("Java"));
        System.out.println("Index of 'Java': " + str.indexOf("Java"));

        // Substring
        System.out.println("Substring: " + str.substring(6, 10));

        // Modification
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Replace: " + str.replace("Java", "AIET"));

        // Whitespace
        System.out.println("Trimmed: '" + str.trim() + "'");

        // Concatenation
        System.out.println("Concatenation: " + str + " Programming");

        // Splitting
        String[] words = str.trim().split(" ");
        System.out.println("Words:");
        for (String w : words) {
            System.out.println(w);
        }

        // StringBuilder
        StringBuilder sb = new StringBuilder("AIET");
        sb.append(" College");
        System.out.println("StringBuilder: " + sb);

        // Formatting
        String formatted = String.format("Welcome %s", "Student");
        System.out.println("Formatted: " + formatted);

        // Email validation
        String email = "test@gmail.com";
        boolean valid = email.contains("@") && email.startsWith("test") && email.endsWith(".com");
        System.out.println("Email valid: " + valid);
    }
}