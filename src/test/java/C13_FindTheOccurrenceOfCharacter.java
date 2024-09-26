import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class C13_FindTheOccurrenceOfCharacter {
    // Java program to find palindromic substrings of a string

        static void indTheOccurrenceOfCharacter( String str)
        {
            Map<Character, Integer> res = new HashMap<>();

            for (int i = 0; i < str.length(); i++) {
                int count=0;
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == str.charAt(i)) {
                        count++;
                    }
                }
                if (count > 0) {
                    res.put(str.charAt(i), count);
                }
            }
            res.forEach((key, value) -> System.out.println(key + ": " + value));

        }

        @Test
        // Driver code
        public  void test()
        {
            String str = "aabddd";
            indTheOccurrenceOfCharacter(str);
        }

}
