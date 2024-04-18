import org.testng.annotations.Test;

/*AB Check

Have the function ABCheck (str) take the stz parameter being passed and return
the string true if the characters a and b are separated by exactly 3 places
anywhere in the string at least once (ie. "lane borrowed" would result in true
because there is exactly three characters between a and b). Otherwise return the string false.

Examples
Input: "after badly"
Output: false

Input: "Laura sobs"
Output: true*/

public class C1_ABCheck
{
    public boolean ABChecker(String str){
        str = str.toLowerCase();
        for(int i=0; i<str.length()-4; i++){
//            System.out.println(str.charAt(i) +"= " +str.charAt(i + 4));
            if (str.charAt(i) == 'a' && str.charAt(i + 4) == 'b') {
                return true;
            }else if (str.charAt(i) == 'b' && str.charAt(i + 4) == 'a'){
                return true;
            }
        }
        return false;
    }
    @Test
    public void runner(){
//        String str="after badly";
        String str="Laura sobs";
        System.out.println(ABChecker(str));

    }

}
