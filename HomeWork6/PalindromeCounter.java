package HomeWork6;

public class PalindromeCounter {
    public int count(String phrase) {

        int counter = 0;
        String[] phraseElements = phrase.toLowerCase().split(" ");
        for (String phraseElement : phraseElements) {

            if (isPalindrome(phraseElement)) {
                counter++;
            }
        }
        return counter;
    }

    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        for (int i = 0; i < (s.length() / 2); i++) {
            if(s.length() <= 2){
                isPalindrome = false;
                break;
            }

            if(s.charAt(i) != s.charAt(((s.length() - 1) - i))){
                isPalindrome = false;
                break;
            }
        }
            return isPalindrome;
        }
}

class PalindromeCounterTest {
    public static void main(String[] args) {
        PalindromeCounter counter = new PalindromeCounter();
        System.out.println(counter.isPalindrome("abba"));

        //1
        System.out.println(counter.count("Level done!"));

        //0
        System.out.println(counter.count("No palindromes"));

        System.out.println(counter.count("ocomt Fuatohotauf Tagat jya"));
    }
}