import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class C3_PrintNumberWithoutLoop{
    void printNumber(int n){
        if(n > 0) {
            System.out.println(n);
            printNumber(n-1);
        }
    }

    @Test
    public void testFunction() {
        printNumber(6);
    }


}
