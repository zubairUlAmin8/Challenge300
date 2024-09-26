import org.testng.annotations.Test;

public class C11_FibonacciSeries {
    // Java program to find palindromic substrings of a string

        static void FibonacciSeries( int num)
        {
            int a=0;
            int b=1;
            int temp = 0;
            for (int i = 0; i < num; i++) {
                System.out.print(a +" ");
               temp =a+b;
                a=b;
                b=temp;
            }

        }

        @Test
        // Driver code
        public  void test()
        {
            int NUM = 10;
            FibonacciSeries(NUM);
        }

}
