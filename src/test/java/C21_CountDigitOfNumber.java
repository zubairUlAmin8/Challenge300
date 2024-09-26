import org.testng.annotations.Test;

import java.util.Arrays;

public class C21_CountDigitOfNumber {

    public static int CountDigitOfNumber(int num) {
        int count=0;
        if (num < 0) {
            num=num*-1;
        }
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

        @Test
        // Driver code
        public  void test()
        {
            int num=89734;
            System.out.println(CountDigitOfNumber(num));
        }

}
