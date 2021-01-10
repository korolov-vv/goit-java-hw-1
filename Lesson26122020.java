public class Lesson26122020 {
   static int[] arr = new int[]{1, 2, 3, 4, 5, 8, 10, 15};

    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            int buffer = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            
        }
    }
}