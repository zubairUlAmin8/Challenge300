import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class C23_FindLargestNumberWithoutIfElse {


    public static int largest(int a, int b) {
        return ((a + b) + Math.abs(a - b)) / 2;
    }

        @Test
        // Driver code
        public  void test()
        {
            int a = 5;
            int b = 10;
            System.out.println("Largest: " + largest(a, b)); // Outputs 10
        }

}
