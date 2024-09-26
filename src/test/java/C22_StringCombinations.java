import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class C22_StringCombinations {

    private static void generateCombinations(String prefix, String s, Set<String> combinations) {
        for (int i = 0; i < s.length(); i++) {
            String newPrefix = prefix + s.charAt(i);
            combinations.add(newPrefix);
            generateCombinations(newPrefix, s.substring(i + 1), combinations);
        }
    }

        @Test
        // Driver code
        public  void test()
        {
            String s = "abc";
            Set<String> combinations = new HashSet<>();
            generateCombinations("", s, combinations);
            for (String combination : combinations) {
                System.out.println(combination);
            }
        }

}
