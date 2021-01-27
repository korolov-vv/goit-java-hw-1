package HomeWork6;

import com.sun.nio.sctp.SctpSocketOption;

import java.util.Arrays;

public class DigitExtracter {
    public int[] extract(String text) {
        char[] chars = text.toCharArray();
        int j = 0;
        int[] digits = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i])) {
            digits[j] = Integer.parseInt(String.valueOf(chars[i]));
            j++;
            }
        }
        return Arrays.copyOf(digits, j);
    }
}

class DigitExtracterTest {
    public static void main(String[] args) {
        DigitExtracter digitExtracter = new DigitExtracter();

        int[] extracted = digitExtracter.extract("april 5, year 2000");

        //[5, 2, 0, 0, 0]
        System.out.println(Arrays.toString(extracted));
    }
}