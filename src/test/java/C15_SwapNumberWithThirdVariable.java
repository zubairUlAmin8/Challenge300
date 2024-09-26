import org.testng.annotations.Test;

public class C15_SwapNumberWithThirdVariable {
    // Java program to find palindromic substrings of a string

        static void Swap( int a, int b)
        {
            a=a+b; //a=40
            b=a-b; //b=10;
            a=a-b; //a=30

            System.out.println("a: "+ a);
            System.out.println("b: "+ b);


        }

        @Test
        // Driver code
        public  void test()
        {
           int a=10;
           int b=30;
            Swap(a, b);
        }

}
