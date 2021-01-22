package HomeWork6;

public class DoubleSpaceCleaner {
    public String clean(String phrase){
        String cleanPhrase = "";
        String[] phraseAr = phrase.split(" ");
        for (int i = 0; i < phraseAr.length; i++) {
            if(phraseAr[i].equals("")){
                cleanPhrase += phraseAr[i] + " ";
            }
        }
        return cleanPhrase.trim();
    }
}
class DoubleSpaceCleaner1 {
    public String clean(String phrase){
        StringBuilder cleanPhrase = new StringBuilder();
        String[] phraseAr = phrase.split(" ");
        for (int i = 0; i < phraseAr.length; i++) {
            if(phraseAr[i].equals("")){
                cleanPhrase.append(phraseAr[i]).append(" ");
            }
        }
        return cleanPhrase.toString().trim();
    }
}
class DoubleSpaceCleanerTest {
    public static void main(String[] args) {
        DoubleSpaceCleaner cleaner = new DoubleSpaceCleaner();

        //Hello World
        System.out.println(cleaner.clean("Hello World"));

        //Hello World
        System.out.println(cleaner.clean("       Hello              World          "));
    }
}
