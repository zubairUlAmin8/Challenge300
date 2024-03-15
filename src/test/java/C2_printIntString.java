import org.testng.annotations.Test;

/*Given a string = “123AM256CD”, print two output strings,
one for all the numbers and one for strings. Provide two ways. (Asked for the exact code)*/
public class C2_printIntString {


    @Test
    public void printIntString(){
        String str="123AM256CD";
        String num="";
        String character = "";

        for(int i=0; i<str.length(); i++){
            char temp=str.charAt(i);
            if(temp>48 && temp<57){
                System.out.println("Temp: "+ temp);
                num+=temp;
            } else if (temp>65 && temp<90) {
                character+=temp;
            }
        }
        System.out.println("Number String: "+ num);
        System.out.println("Character String: "+ character);
    }
    @Test
    public void printIntString2(){
        String str="123AM256CD";
        String num="";
        String character = "";
        for(int i=0; i<str.length(); i++){
            char temp=str.charAt(i);
            if(Character.isDigit(temp)){
                num+=temp;
            } else{
                character+=temp;
            }
        }
        System.out.println("Number String: "+ num);
        System.out.println("Character String: "+ character);
    }

}
