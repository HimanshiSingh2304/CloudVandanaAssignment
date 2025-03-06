import java.util.Arrays;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove any spaces and convert both strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // If the lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert the strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        // Sort the character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare the sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        // Test inputs
        String input1 = "listen";
        String input2 = "silent";
        
        // Check if the strings are anagrams
        if (areAnagrams(input1, input2)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }

        // Another test case
        String input3 = "hello";
        String input4 = "world";
        
        if (areAnagrams(input3, input4)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }
}
