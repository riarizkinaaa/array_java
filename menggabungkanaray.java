import java.util.Arrays;

public class menggabungkanaray {
    public static void main(String[] args) {
        int[] arrayangka1 = { 1, 2, 3, 4, 5 };
        int[] arrayangka2 = { 6, 7, 8, 9, 0 };
        // menggabungkan dua buah array
        System.out.println("menggabungkan dua buah array");
        int[] arrayHasil2 = new int[arrayangka1.length + arrayangka2.length];
        for (int i = 0; i < arrayangka1.length; i++) {
            arrayHasil2[i] = arrayangka1[i];
        }
        for (int i = 0; i < arrayangka2.length; i++) {
            arrayHasil2[i + arrayangka1.length] = arrayangka2[i];
        }
        printarray(arrayangka1, "hasil1");
        printarray(arrayangka2, "hasil2");
        printarray(arrayHasil2, "hasil");
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
