import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C20_AnagramChecker {
    // Java program to find palindromic substrings of a string


    // Function to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) {
        // Remove all whitespace and convert both strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths of both strings are the same
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        // Sort the character arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }

        @Test
        // Driver code
        public  void test()
        {
            String str1 = "Listen";
            String str2 = "Silent";

            if (areAnagrams(str1, str2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }

        }

}
