package HomeWork6;

public class BigOrSmall {
    public String calculate(String text){
        int bigCount = 0;
        int smallCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                bigCount++;
            } else if(Character.isLowerCase(text.charAt(i))){
                smallCount++;
            }
        }
        if(smallCount > bigCount){
            return "Small";
        }else if(smallCount < bigCount){
            return "Big";
        }else return "Same";
    }
}
class BigOrSmallTest {
    public static void main(String[] args) {
        //Small
        System.out.println(new BigOrSmall().calculate("Java"));

        //Big
        System.out.println(new BigOrSmall().calculate("JAVA"));

        //Same
        System.out.println(new BigOrSmall().calculate("jAvA"));
    }
}