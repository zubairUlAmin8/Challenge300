import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class C19_FindAvgFromNumberOfList {
    // Java program to find palindromic substrings of a string


    public static int findAvg(List<Integer> num) {

        int i=0;
        int temp=0;
        while (i < num.size()) {
            temp += num.get(i);
            i++;
        }
        return temp / num.size();
    }

        @Test
        // Driver code
        public  void test()
        {
            List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(10);
            list.add(5);

            System.out.println(findAvg(list));

        }

}
