import java.util.Arrays;

public class loopingArray {
    public static void main(String[] args) {

        /*
         * penulisan array
         * int []arrayangka={2,3,4,5,6} atau bisa juga seperti ini
         * int arrayangka[]={2,3,4,5,6,9}
         */

        int[] nilai = { 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(nilai));
        // looping standar
        System.out.println("loping standar");
        for (int i = 0; i < 8; i++) {
            System.out.println("index ke  " + i + " adalah " + nilai[i]);
        }
        // looping dengan length
        System.out.println("loping dengan length");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("index ke  " + i + " adalah " + nilai[i]);

        }
        // looping dengan for each
        System.out.println("looping dengan for each");
        for (int angka : nilai) {
            System.out.println("for each bernilai " + angka);

        }

    }
}
