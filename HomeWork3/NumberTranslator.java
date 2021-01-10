package HomeWork3;

public class NumberTranslator {
    public static void main(String[] args) {
        translate("i");
    }
    public static int translate(String romanNumber) {
        String romanNumberClean = romanNumber.toUpperCase().trim();
        switch(romanNumberClean) {
            case "I":
                // code block
                return 1;
             //   break;
            case "II":
                // code block
                return 2;
            //    break;
            case "III":
                // code block
                return 3;
            //    break;
            case "IV":
                // code block
                return 4;
            //    break;
            case "V":
                // code block
                return 5;
            //    break;
            case "VI":
                // code block
                return 6;
            //    break;
            case "VII":
                // code block
                return 7;
            //    break;
            case "VIII":
                // code block
                return 8;
            //    break;
            case "IX":
                // code block
                return 9;
            //    break;
            case "X":
                // code block

                return 10;
            //    break;
            case "XI":
                // code block
                return 11;
            //    break;
            case "XII":
                // code block
                return 12;
            //    break;
            default: return -1;
        }
    }
}
