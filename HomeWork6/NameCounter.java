package HomeWork6;

public class NameCounter {
    public int count(String text){
        int count = 0;
        String[] s = text.split(" ");
        for (int i = 0; i < s.length; i++) {
            boolean x = Character.isUpperCase(s[i].charAt(0)) && s[i].length() >= 2;
            boolean y = s[i].substring(1, s[i].length() - 1).toLowerCase().equals(s[i].substring(1, s[i].length() - 1));
            if (x && y) {
                count++;
            }
        }
        return count;
    }
}
class NameCounterTest {
    public static void main(String[] args) {
        //1
        System.out.println(new NameCounter().count("Mars is great planet"));

        //2
        System.out.println(new NameCounter().count("Moon is near Earth"));

        //0
        System.out.println(new NameCounter().count("SPACE IS GREAT"));
    }
}