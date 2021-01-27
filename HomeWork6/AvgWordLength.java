package HomeWork6;

public class AvgWordLength {
    public double count(String phrase){
        double avgWordLength;
        double length = 0;
        String[] words = phrase.split(" ");
        for (int i = 0; i < words.length; i++) {
            length += words[i].length();
        }
        return length / words.length;
    }
}
class AvgWordLengthTest {
    public static void main(String[] args) {
        //6
        System.out.println(new AvgWordLength().count("Launch Rocket"));

        //4.5
        System.out.println(new AvgWordLength().count("Life is strange thing"));
    }
}