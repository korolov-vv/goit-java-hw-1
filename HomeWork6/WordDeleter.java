package HomeWork6;

public class WordDeleter {
    public String remove(String phrase, String[] words) {
        boolean found = false;
        String[] phrases = phrase.split(" ");
        StringBuilder result = new StringBuilder();
        for (String phr : phrases) {
            for (String word : words) {
                if (phr.equals(word)) {
                    found = true;
                    continue;
                }
            }
            if (!found) {
                result.append(phr);
                result.append(" ");
            }
            found = false;
        }
        return result.toString().trim();
    }
}
