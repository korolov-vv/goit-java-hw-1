package HomeWork3;

import java.util.Arrays;

public class UberShop {
    //Zadacha 32
    public int[] removePrice(int[] prices, int toRemove) {
        int j = 0;
        int x = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] == toRemove) {++x;}
        }
        int[] finalPrices = new int[prices.length - x];
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] != toRemove) {
                finalPrices[j++] = prices[i];
            }
        }
        return finalPrices;
    }

    // Zadacha 31
    public int getMinPriceCount(int[] prices) {
        int i = 0;
        Arrays.sort(prices);
        if (prices.length == 0) {
            return 0;
        } else {
            for (; prices[i] == prices[i + 1]; i++) {
            }
        }
        return i + 1;
    }

    // Zadacha 30
    public int[] findMinMaxPrices(int[] prices) {

        int[] newPrices = Arrays.copyOf(prices, prices.length);
        Arrays.sort(newPrices);
//        int i = 0;
//        int[] resultArray = new int[i];
        if (newPrices.length == 0) {
            return new int[0];
        } else if (newPrices[0] == newPrices[newPrices.length - 1]) {
            return new int[]{newPrices[0]};
        } else
            return new int[]{newPrices[0], newPrices[newPrices.length - 1]};
    }

    // Zadacha 29
    public void multiplyPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else prices[i] *= 1.5;
        }
    }

    // Zadacha 28
    public void printPrices(float[] prices) {
        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i] + " jup.");
        }
    }

    //Test output
    public static void main(String[] args) {
        UberShop shop = new UberShop();

        //Should be 100 jup. 23.5 jup. 400 jup. - one price per line
//        float[] prices = new float[]{100f, 23.5f, 400f};
//        shop.printPrices(prices);

        //Should be [200, 2250]
        float[] prices2 = new float[]{100f, 1500f};
        shop.multiplyPrices(prices2);
        System.out.println(Arrays.toString(prices2));

        //Should be [50, 1500]
        int[] prices3 = new int[]{100, 1500, 300, 50};
        int[] minMax = shop.findMinMaxPrices(prices3);
        System.out.println(Arrays.toString(minMax));

        //Should be [50, 1500]
        int[] prices4 = new int[]{11, 10, 10, 11, 10, 12, 10, 9, 11, 11, 12, 9, 12, 12, 10};
        System.out.println(shop.getMinPriceCount(prices4)); //Should be 2

        //Should be [150, 200]
        int[] prices = new int[]{0, 6, 7, 6, 1, 5, 2, 8, 9, 5};
        int toRemove = 6;
        System.out.println(Arrays.toString(shop.removePrice(prices, toRemove)));
    }
}
