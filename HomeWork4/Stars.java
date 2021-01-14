package HomeWork4;

public class Stars {
        private int count;
        public int getCount(){
            return count;
        }

        public void setCount(int starsCount) {
            this.count = starsCount;
        }

        @Override
        public String toString(){
            String thousends = "";
            String hund = "";
            String ten = "";
            String jed = "";

            String result = thousends + hund + ten + jed;
            if (count <= 9) {
                for (int i = 1; i <= count; i++) {
                    jed += "*";
                    result = jed;
                }
            } else
                if (count <= 99) {
                for (int j = 1; j <= count / 10; j++) {
                    ten += "Z";
                }
                for (int i = 1; i <= count % 10 ; i++) {
                    jed += "*";
                }
                result = ten + jed;
            } else
                if (count <= 999) {
                    for (int x = 1; x <= count / 100 ; x++) {
                        hund += "Y";
                    }
                    for (int j = 1; j <= (count % 100) / 10; j++) {
                        ten += "Z";
                    }
                    for (int i = 1; i <= (count % 100) % 10; i++) {
                        jed += "*";
                    }
                    result = hund + ten + jed;
                } else
                if (count <= 9999) {
                    for (int z = 1; z <= count / 1000; z++) {
                        thousends += "X";
                    }
                    for (int x = 1; x <= (count % 1000) / 100 ; x++) {
                        hund += "Y";
                    }
                    for (int j = 1; j <= ((count % 1000) % 100) / 10; j++) {
                        ten += "Z";
                    }
                    for (int i = 1; i <= ((count % 1000) % 100) % 10; i++) {
                        jed += "*";
                    }
                    result = thousends + hund + ten + jed;
                }
            return result;
        }

    public static void main(String[] args) {
        Stars stars = new Stars();
        stars.setCount(153);
        System.out.println(stars);
        System.out.println(stars.getCount());
    }
}
