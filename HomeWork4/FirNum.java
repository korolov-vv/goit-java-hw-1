package HomeWork4;

public class FirNum {
    public int calc(int n){
        return n;
    }
}

class FirNumBasis extends FirNum {
    @Override
    public int calc(int n){
        int res = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0){
                res += i;
            }
        }
        return res / 2;
    }
}

class FirNumSum extends FirNum {
    @Override
    public int calc(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
class FirNumFactorial extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        if(n == 0){
            return result;
        }else {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        return result;
    }
}
class FirNumMultiplyOdd extends FirNum {
    @Override
    public int calc(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            if(i % 2 != 0){
                result *= i;
            }
        }
        return result;
    }
}
class FirNumFizzBuzz extends FirNum {
    @Override
    public int calc(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if(((i % 3 == 0) && !(i % 5 == 0)) | (!(i % 3 == 0) && (i % 5 == 0))){
                result += i;
            }
        }
        return result;
    }
}
class FirTest {
    public int test(FirNum firNum, int number) {
        return firNum.calc(number);
    }

    public static void main(String[] args) {
        FirNum firNum = new FirNum();
        FirTest firTest = new FirTest();
        FirNum firNum1 = new FirNumFactorial();
        FirNum firNum2 = new FirNumSum();
        FirNum firNum3 = new FirNumMultiplyOdd();
        FirNum firNum4 = new FirNumFizzBuzz();
        FirNum firNum5 = new FirNumBasis();

        //Should be 10
        System.out.println(firTest.test(firNum, 10));

        //Should be 6
        System.out.println(firTest.test(firNum2, 3));

        //Should be 120
        System.out.println(firTest.test(firNum1, 5));

        //Should be 15
        System.out.println(firTest.test(firNum3, 5));

        //Should be 83
        System.out.println(firTest.test(firNum4, 20));

        //Should be 10
        System.out.println(firTest.test(firNum5, 9));
    }
}