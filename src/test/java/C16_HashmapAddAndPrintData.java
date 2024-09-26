import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class C16_HashmapAddAndPrintData {
    // Java program to find palindromic substrings of a string



        @Test
        // Driver code
        public  void test()
        {
            Map<String, String> myset = new HashMap<>();

            myset.put("Name", "Zubair Ul Amin");
            myset.put("Company", "Zapta Technologies");
            myset.forEach((key, value) -> System.out.println(key+ ": "+value ));
        }

}
