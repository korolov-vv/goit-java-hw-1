package HomeWork3;

public class ATM {
    public int countBanknotes(int sum){
        int[] banknotes = new int[] {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int banknotesCount = 0;
        int i = 0;
        int ost = sum;

        do {
            banknotesCount += ost / banknotes[i];
            ost = ost % banknotes[i];
            i++;
        } while (ost != 0);

        return banknotesCount;
    }
}
class A{
    public static void main(String[] args) {
        System.out.println(new ATM().countBanknotes(500));
    }
}
