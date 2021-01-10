package HomeWork3;

import java.util.Arrays;

public class CaptainDisputeAgain {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{4, 5, 10}));
    }

    public static int findMin(int[] triple){
        Arrays.sort(triple);
        return triple[0];
    }
}
