import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class C9_ReverseString {
    // Java program to find palindromic substrings of a string

        static int ReverseString( String str)
        {

            Stack<Character> res = new Stack<>();
            String temp = "";
            int i=0;
            while (i < str.length()) {
                res.push(str.charAt(i));
                i++;
            }

            while (!res.isEmpty()) {
                temp += res.pop().toString();
            }
            System.out.println(temp);

            return 0;
        }

        @Test
        // Driver code
        public  void test()
        {
            String str = "zuabir";

            System.out.println(
                    ReverseString(str));
        }

}
