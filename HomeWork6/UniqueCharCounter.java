package HomeWork6;

public class UniqueCharCounter {
    public int count(String phrase){
      return (int) phrase.chars()
                .distinct()
                .count();
    }
}

class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
//        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));

        String s = "Java";
        System.out.println(s.charAt(1) == s.charAt(3));
    }
}
