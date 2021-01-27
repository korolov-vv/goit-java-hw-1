package HomeWork6;

public class WaterCounter {
    public double count(String text){
        char[] ch = text.toCharArray();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if(Character.isSpaceChar(ch[i])){
                count++;
            }
        }
        return (double) count / text.length();
    }
}
class WaterCounterTest {
    public static void main(String[] args) {
        //0.07692307692307693
        System.out.println(new WaterCounter().count("Moon invaders"));

        //0
        System.out.println(new WaterCounter().count("NoWater"));
    }
}
