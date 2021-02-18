package HomeWork3;

public class TrurlBank {

    public int countSumOfDigits(int number){
        int sum = 0;
        String[] s = Integer.toString(number).split("");
        int i = 0;
        while (i < s.length){
            sum += Integer.parseInt(s[i]);
            i++;
        }
        return sum;
    }

    public int sumQuads(int n){
        int sum = 0;
        while (n > 0){
            sum += n * n;
            n--;
        }
        return sum;
    }

    public static void main(String[] args) {

        TrurlBank bank = new TrurlBank();

        //Should be 14 - 1 + 4 + 9
        System.out.println(bank.sumQuads(3));

        //Should be 16 - 5 + 4 + 7
        System.out.println(bank.countSumOfDigits(547));
    }
}
