import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class C14_FindFiveConsecutiveNumbersWhoseSumis850 {
    // Java program to find palindromic substrings of a string

        static int FindFirstNumber( int sum, int n)
        {
            int x=0;
            x=(sum -(((n-1)*n)/2))/n;
            return x;

        }

        @Test
        // Driver code
        public  void test()
        {
           int sum=850;
           int TargetConsectiveNo=5;
            int firstNumber=FindFirstNumber(sum, TargetConsectiveNo);
            for (int i = 0; i < TargetConsectiveNo; i++) {
                System.out.println(firstNumber+i);
            }
        }

}
