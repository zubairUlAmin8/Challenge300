import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class C8_FindUniqueCharInString {
    // Java program to find palindromic substrings of a string

        static int FindUniqueCharInString( String str)
        {

            Set<Character> res = new LinkedHashSet<>();
            for (int i = 0; i < str.length(); i++) {
                for (int j = i; j< str.length(); j++) {
                    if (str.toLowerCase().charAt(i) == str.toLowerCase().charAt(j)) {
                        res.add(str.charAt(i));
                    }
                }
            }
            if (!res.isEmpty()) {
                System.out.println(res);
                System.out.println(res.size());
            }


            return 0;
        }

        @Test
        // Driver code
        public  void test()
        {
            String str = "abbbdbbcccbbkkhdkjdfkakldfjakljc";

            System.out.println(
                    FindUniqueCharInString(str));
        }

}
