package HomeWork6;

public class WordCombine {
    public boolean canCombine(String sourceWord, String targetWord){
        char[] ch = targetWord.toLowerCase().toCharArray();
        boolean canCombine = true;
        for (int i = 0; i < targetWord.length(); i++) {
            if(!sourceWord.toLowerCase().contains(Character.toString(ch[i]))){
                canCombine = false;
                break;
            }
        }
        return canCombine;
    }
}
class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));
    }
}