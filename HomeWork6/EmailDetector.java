package HomeWork6;

public class EmailDetector {
    public boolean isPresent(String text){
        boolean isEmail = false;
        if(text.length() < 5){return false;}
        char[] ch = text.toCharArray();
        if(ch[0] == '@' || ch[1] == '@'){return false;}

        for (int i = 2; i < ch.length; i++) {
            if(ch[i] == '@'){
                if(Character.isSpaceChar(ch[i - 1]) ||
                        Character.isSpaceChar(ch[i - 2]) ||
                        Character.isSpaceChar(ch[i + 1]) ||
                        Character.isSpaceChar(ch[i + 2])){
                    return false;
                }else isEmail = true;

            }
        }
        return isEmail;
    }
}
class EmailDetectorTest {
    public static void main(String[] args) {
        //true
        System.out.println(new EmailDetector().isPresent("This email is no-reply@goo.com"));

        //false
        System.out.println(new EmailDetector().isPresent("No email present, but @ there"));
    }
}