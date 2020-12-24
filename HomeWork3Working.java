import java.util.Arrays;

public class HomeWork3Working {
    public static void main(String[] args) {
        String[] names = new String[]{"mixa", "ukio", "barek", "krou", "fiha"};
        String[] toReplace = new String[]{"lopr", "boki"};
        String[] namesNew = new String[]{"io", "pu", "re", "max", "kok", "mis", "hit", "kio", "pax", "rew"};
        String[] results = new String[]{"mix", "max", "pex", "fux", "rox"};
        char[][] keyboard = new char[4][3];
//        fixNames(names, toReplace);
//        firstAndLastTogether(namesNew);
//        System.out.println(Arrays.toString(names));
//        changeElectResultAgain(results);
//        System.out.println(Arrays.toString(changeElectResultAgain(results)));
//        for (int i = 0; i < keyboard.length; i++) {
//            System.out.println(createKeyboard());
//        }
        String[] source = new String[] {"Hero", "Mihu"};
        String[] copy = HomeWork3Working.makeCopy(source);

        source[0] = "CHANGED!"; //Мы меняем исходный массив, но на копии это не отображается

        System.out.println(Arrays.toString(copy));
    }
//    }

// Задача 13
    public static String[] makeCopy(String[] names){
        String[] namesCopied = Arrays.copyOf(names, names.length);
        System.out.println("Copied!");
        return namesCopied;
    }

//  Задача 12
public void printKeyboard(){
    char[][] printKeyboard = createKeyboard();
    for(int i = 0; i < 4; i++) {
        System.out.println(Arrays.toString(printKeyboard[i]));
    }
}

// Задача 11
    public static char[][] createKeyboard(){

        char[][] keyboard = new char[4][3];
        keyboard[0][0] = '1';
        keyboard[0][1] = '2';
        keyboard[0][2] = '3';
        keyboard[1][0] = '4';
        keyboard[1][1] = '5';
        keyboard[1][2] = '6';
        keyboard[2][0] = '7';
        keyboard[2][1] = '8';
        keyboard[2][2] = '9';
        keyboard[3][0] = '*';
        keyboard[3][1] = '0';
        keyboard[3][2] = '#';

        return keyboard;

//        char[][] keyboard = new char[4][3];
//        for(int i = 0; i < 3; i++) {
//            for(int j = 0; j < 3; j++){
//                int x = 1;
//                x++;
//            }
//            if (i == 3) {
//                keyboard[4][1] = '*';
//                keyboard[4][1] = '0';
//                keyboard[4][1] = '#';
//            }
//
//        }
//
//        return keyboard;
    }

// Задача 10
    public static String[] changeElectResultAgain(String[] results){
        String[] resultsNew = new String[3];
                System.arraycopy(results, 2, resultsNew, 0, 3);
        System.out.println(resultsNew);
        return resultsNew;
    }

// Задача 9
    public void changeElectResult(String[] results){
        String x = results[0];
        String y = results[results.length - 1];
        results[0] = y;
        results[results.length - 1] = x;
//        return results;
    }

// Задача 8
    public static String firstAndLastTogether(String[] names) {
            return names[0] + " AND " + names[names.length - 1] + " TOGETHER";
    }

//Задача 7
    public static void fixNames(String[] names, String[] toReplace) {
        int j = 0;
        for (int i = 0; i <= (names.length - 1); i++) {

                if (i % 2 == 1) {
                    System.out.println("Wchod w metod");
                    names[i] = toReplace[j];
                    System.out.println(names[i]);
                    j++;
                } else {
                    System.out.println("Nie wchod w metod");
                    System.out.println(1 + names[i]);
                }
        }
    }
}