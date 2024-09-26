import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class C17_ProductWithoutMultiplication {
    // Java program to find palindromic substrings of a string


    public static int multiply(int a, int b) {
       int res=0;
        for (int i = 0; i < a; i++) {
            res+=b;
        }
        return res;
    }

        @Test
        // Driver code
        public  void test()
        {
            int num1 = 5;
            int num2 = 4;

            int product = multiply(num1, num2);
            System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);

        }

}
