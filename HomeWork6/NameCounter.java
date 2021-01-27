package HomeWork6;

public class NameCounter {
    public int count(String text){
        int count = 0;
        String[] s = text.split(" ");
        for (int i = 0; i < s.length; i++) {
            if(Character.isUpperCase(s[i].charAt(0)) && s[i].length() >= 2){
                for (int j = 1; j < s[i].length();) {
                    if(Character.isLowerCase(s[i].charAt(j))){
                        j++;
                    }else break;
                }
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