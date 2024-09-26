import org.testng.annotations.Test;

public class C21_CountNoOfVowelsAndConsonants {

    public static boolean CheckVowel(char a) {

        if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u') {
            return true;
        } else if (a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U') {
            return true;
        }else {
            return false;
        }
    }

        @Test
        // Driver code
        public  void test()
        {
            String str = "aiodfvhskdfkioafbc";
            int vowel=0;
            int consonant=0;
            for (int i = 0; i < str.length(); i++) {
                if (CheckVowel(str.charAt(i))) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
            System.out.println("No of Vowel: " + vowel);
            System.out.println("NO of consonant: " + consonant);
        }

}
