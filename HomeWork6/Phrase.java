package HomeWork6;


import java.util.Arrays;

class Phrase {
    private final String[] words;

    public Phrase(String[] words) {
        this.words = Arrays.copyOf(words, words.length);
    }

    public String[] getWords() {
        return words;
    }

    @Override
    public String toString() {
        String phrase = new String("");
        for (int i = 0; i < words.length; i++) {
            phrase += words[i] + " ";
        }
        return phrase.trim();
    }
}
class PhraseTest {
    public static void main(String[] args) {
        String[] words = {"alpha", "beta", "gamma"};

        Phrase phrase = new Phrase(words);

        //alpha beta gamma
        System.out.println(phrase);

        words[0] = "zero";

        //alpha beta gamma
        System.out.println(phrase);
    }
}