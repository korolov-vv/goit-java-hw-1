package HomeWork6;

public class PunctuationMarkCounter {
    public int count(String phrase) {
        char[] symb = phrase.toCharArray();
        int count = 0;
        for (int i = 0; i < symb.length; i++) {
            if (symb[i] == '.' | symb[i] == ',' | symb[i] == '!' | symb[i] == ':' | symb[i] == ';') {
                ++count;
            }
        }
        return count;
    }
}

class PunctuationMarkCounterTest {
    public static void main(String[] args) {
        PunctuationMarkCounter counter = new PunctuationMarkCounter();

        //2
        System.out.println(counter.count("Hello, world!"));

        //1
        System.out.println(counter.count("This is Sparta!"));

        //1
        System.out.println(counter.count("End."));
    }
}
