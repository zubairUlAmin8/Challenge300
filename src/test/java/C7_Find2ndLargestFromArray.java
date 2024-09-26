import org.testng.annotations.Test;

public class C7_Find2ndLargestFromArray {
    // Java program to find palindromic substrings of a string

        static int find2ndLargestFromArray( int[] array)
        {
            for(int i=0; i<array.length; i++){
                for(int j=i+1; j<array.length; j++){
                    if(array[i]>=array[j]){
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            int secondHighest = array[array.length-2];
            return secondHighest;
        }

        @Test
        // Driver code
        public  void test()
        {
            int[] array = {3,1,8,5};

            System.out.println(
                    find2ndLargestFromArray(array));
        }

}
