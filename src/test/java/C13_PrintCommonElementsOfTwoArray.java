import org.testng.annotations.Test;

import java.util.LinkedHashSet;
import java.util.Set;

public class C13_PrintCommonElementsOfTwoArray {
    // Java program to find palindromic substrings of a string

        static void PrintCommonElementsOfTwoArray( int[] arr1, int[]arr2)
        {
            Set<Integer> uniqueSet = new LinkedHashSet<>();

            for (int num : arr1) {
                uniqueSet.add(num);
            }
            for (int num : arr2) {
                if (uniqueSet.contains(num)) {
                    System.out.print(num+" ");
                }

            }


        }

        @Test
        // Driver code
        public  void test()
        {
            int[] arr1 = {1, 5, 4, 5, 9, 1};
            int[] arr2 = {1, 5, 6, 4, 5, 9, 1};
            PrintCommonElementsOfTwoArray(arr1, arr2);
        }

}
