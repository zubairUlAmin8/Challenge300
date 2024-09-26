import org.testng.annotations.Test;

public class C12_Factorial {
    // Java program to find palindromic substrings of a string

        static void Factorial( int num)
        {
            int temp=1;
            for (int i = 1; i <= num; i++) {
                temp=temp*i;

            }
            System.out.println(temp);
        }
    static int FactorialWithRecursion( int num)
    {
        if (num == 0 || num == 1)
            return 1;
        return num * FactorialWithRecursion(num - 1);

    }

        @Test
        // Driver code
        public  void test()
        {
            int NUM = 10;
//            Factorial(NUM);
            System.out.println(FactorialWithRecursion(NUM));
        }

}
