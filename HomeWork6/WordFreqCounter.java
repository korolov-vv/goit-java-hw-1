package HomeWork6;

import java.util.Locale;

public class WordFreqCounter {
    public float countFreq(String phrase, String word){
        int j = 0;
        String[] phraseElements = phrase.toLowerCase().split(" ");
        for (int i = 0; i < phraseElements.length ; i++) {
            if(phraseElements[i].equals(word.toLowerCase())){
                ++j;
            }
        }
        return (float) j / (float) phraseElements.length;
    }
}
class WordFreqCounterTest {
    public static void main(String[] args) {
        WordFreqCounter freqCounter = new WordFreqCounter();

        //0.5
        System.out.println(freqCounter.countFreq("Hello Java", "java"));

        //0
        System.out.println(freqCounter.countFreq("Hello World", "java"));
    }
}