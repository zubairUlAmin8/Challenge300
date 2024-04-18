import org.testng.annotations.Test;

public class C4_PrintArrayWithoutLoop {
    void printArrayElement(int[] arr, int n){
        if(n>0) {
            System.out.println(arr[n-1]);
            printArrayElement(arr, n-1);

        }
    }

    @Test
    public void testFunction() {
        int[] arr ={1, 3, 4 , 6};
        printArrayElement(arr, 4);
    }


}
