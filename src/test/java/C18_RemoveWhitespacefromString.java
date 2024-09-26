import org.testng.annotations.Test;

import java.util.List;

public class C18_RemoveWhitespacefromString {
    // Java program to find palindromic substrings of a string


    public static String RemoveWhiteSpace(String str) {
        String temp = "";
        String[] res = str.split(" ");
        for (int i = 0; i < res.length; i++) {
            temp += res[i];
        }
        return temp;
    }

        @Test
        // Driver code
        public  void test()
        {
            String str = "Zubair Ul amin";
            System.out.println(RemoveWhiteSpace(str));

        }

}
