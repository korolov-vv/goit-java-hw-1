package HomeWork6;

import java.util.Arrays;

public class WordSplitter {
    public String[] split(String phrase){
        String phraseLowerCase = phrase.toLowerCase();
        String[] phrasesWords = phraseLowerCase.split(" ");
        int j = 0;
        int x = 0;
        for (int i = 0; i < phrasesWords.length; i++) {
            if(phrasesWords[i].length() <= 1) {
                ++x;
            }
        }
        String[] finalResult = Arrays.copyOf(phrasesWords, (phrasesWords.length - x));
        for (int i = 0; i < phrasesWords.length; i++) {
            if(phrasesWords[i].length() > 1) {
                finalResult[j] = phrasesWords[i];
                j++;
            }
        }
        return finalResult;
    }
}
class WordSplitterTest {
    public static void main(String[] args) {
        WordSplitter wordSplitter = new WordSplitter();

        String[] words = wordSplitter.split("Hello      world");

        //[hello, world]
        System.out.println(Arrays.toString(words));
    }
}