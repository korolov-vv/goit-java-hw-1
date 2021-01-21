package HomeWork5;

class TotalScore {
    public int sum(int[] scores) {
        int result = 0;
        int index = 0;

        for (; index < scores.length ; index++) {
            result += scores[index];
        }
        return result;
    }
}

class TotalScoreTest {
    public static void main(String[] args) {
        int[] score = {10, 20, 100};

        //130
        System.out.println(new TotalScore().sum(score));
    }
}