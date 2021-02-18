package HomeWork3;

public class ArlanHelper {

    public String drawPattern(char[] pattern, int repeatCount){
        StringBuilder sb = new StringBuilder();
        int patternLength;
        while (repeatCount > 0){
            patternLength = 0;
            while (patternLength < pattern.length){
                sb.append(pattern[patternLength]);
                patternLength++;
            }
            repeatCount--;
        }
        return sb.toString();
    }

    public String drawLine(int length){
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (i <= length){
            if(i % 2 != 0){
                sb.append("*");
            }else {sb.append("#");}
            i++;
        }
        return sb.toString();
    }

    public String drawRect(int width, int height, char c){
        StringBuilder sb = new StringBuilder();
        while (height > 0) {
            int b = width;
            while (b > 0) {
                sb.append(c);
                b--;
            }
            sb.append("\n");
            height--;
        }
        return sb.toString();
    }

    public String drawQuad(int n){
        StringBuilder sb = new StringBuilder();
        int a = n;
        int b;
        while (a > 0) {
            b = n;
            while (b > 0) {
                sb.append("*");
                b--;
            }
            sb.append("\n");
            a--;
        }
        return sb.toString();
    }
    //Test output
    public static void main(String[] args) {
        ArlanHelper helper = new ArlanHelper();
        //Should be:
        //**
        //**
        System.out.println(helper.drawQuad(4));

        //Should be:
        //XX
        //XX
        //XX
        System.out.println(helper.drawRect(2, 3, 'X'));

        //Should be:
        //*#*#*
        System.out.println(helper.drawLine(5));

        //Should be:
        //JavaJavaJavaJava
        System.out.println(helper.drawPattern(new char[] {'J', 'a', 'v', 'a'}, 3));
    }
}
