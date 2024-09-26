import org.testng.annotations.Test;

import java.util.Stack;

public class C6_checkPalindromesUsingStack {
    // Java program to find palindromic substrings of a string
    public static boolean palindrome(String str){
        Stack<Character> stack = new Stack<>();
        String res = "";
        int i=0;
        while(i<str.length()){
            stack.push(str.charAt(i));
            i++;
        }
        while(!stack.isEmpty()){
            res = res + stack.pop();
        }
        if(res.toLowerCase().equals(str.toLowerCase())){
            System.out.println(str+" is a palindrome");
            return true;
        }
        else{
            System.out.println(str+" is not a palindrome");
            return false;
        }
    }

        @Test
        // Driver code
        public  void test()
        {
            String str = "aba";
            System.out.println(palindrome(str));
        }

}
