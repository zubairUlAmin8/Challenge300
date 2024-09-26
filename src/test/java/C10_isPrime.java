import org.testng.annotations.Test;

import java.util.Stack;

public class C10_isPrime {
    // Java program to find palindromic substrings of a string

        static void isPrime( int num)
        {
            int flag=0;
            if (num == 0 || num == 1) {
                System.out.println("Prime");
            } else {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        flag++;

                    }
                }
                if (flag ==0) {
                    System.out.println("Prime");
                } else {
                    System.out.println("Not Prime");                }
            }
        }

        @Test
        // Driver code
        public  void test()
        {
            int NUM = 6;

                    isPrime(NUM);
        }

}
