import java.util.Arrays;

public class mejumlahkan {
    public static void main(String[] args) {
        int[] arrayangka1 = { 1, 2, 3, 4, 5 };
        int[] arrayangka2 = { 6, 7, 8, 9, 0 };
        // mmenjumlahkankan dua buah array
        System.out.println("menjumlahkah dua buah array");
        int[] hasilarray = jumlaharray(arrayangka1, arrayangka2);
        printarray(arrayangka1, "hasil1");
        printarray(arrayangka2, "hasil2");
        printarray(hasilarray, "hasil");

    }

    private static int[] jumlaharray(int[] arrayint, int[] arrayint2) {
        int[] hasilarray = new int[arrayint2.length];
        for (int i = 0; i < arrayint.length; i++) {
            hasilarray[i] = arrayint[i] + arrayint2[i];

        }
        return hasilarray;

    }

    private static void printarray(int[] dataarray, String massage) {
        System.out.println(massage + "=" + Arrays.toString(dataarray));
    }

}
