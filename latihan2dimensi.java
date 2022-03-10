import java.util.Arrays;

public class latihan2dimensi {
    public static void main(String[] args) {
        int[][] arrayangka1 = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9 }
        };
        System.out.println(Arrays.deepToString(arrayangka1));
        // untuk menampilkan array untuk 2 dimensi mengunakan deepToString
        int[] angka = { 1, 2, 3 };
        System.out.println(Arrays.toString(angka));
    }

}
