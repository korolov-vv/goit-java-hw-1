package HomeWork6;

class SensitiveDataSearcher {
    public boolean isSensitiveDataPresent(String phrase) {
        boolean found = false;
        String[] words = {"pass", "key", "login", "email"};
        String[] phrases = phrase.toLowerCase().split(" ");
        for (String phr : phrases) {
            for (String word : words) {
                if (phr.equals(word)) {
                    found = true;
                }
            }
        }
        return found;
    }
}

class SensitiveDataSearcherTest {
    public static void main(String[] args) {
        SensitiveDataSearcher searcher = new SensitiveDataSearcher();

        //false
        System.out.println(searcher.isSensitiveDataPresent("Hello world"));

        //true
        System.out.println(searcher.isSensitiveDataPresent("Pass: swordfish"));
    }
}
