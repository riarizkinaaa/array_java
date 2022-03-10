import java.util.Arrays;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class operasiarray {
    public static void main(String[] args) {
        int[] arrayangka1 = { 1, 2, 3, 4, 5, 6, 7 };
        /*
         * System.out.println(Arrays.toString(arrayangka1));<-- bisa juga seperti ini
         * tanpa harus membuat fungsi baru
         */
        printarray(arrayangka1);
        // mengkopi array
        System.out.println("mengkopi array");
        int[] arrayangka2 = new int[7];
        printarray(arrayangka1);
        printarray(arrayangka2);

        System.out.println("mengkopi dengan loop");
        for (int i = 0; i < arrayangka1.length; i++) {
            arrayangka2[i] = arrayangka1[i];
        }
        printarray(arrayangka1);
        printarray(arrayangka2);

        // mengkopi dengan copyOf
        System.out.println("mengkopi dengan copyOf");
        int[] arrayangka3 = Arrays.copyOf(arrayangka1, 5);
        printarray(arrayangka1);
        printarray(arrayangka3);

        // mengkopi dengan copyOfRange
        System.out.println("mengkopi dengan copyOfRange");
        int[] arrayangka4 = Arrays.copyOfRange(arrayangka1, 3, 6);
        printarray(arrayangka1);
        printarray(arrayangka4);

        // fill array
        System.out.println("fill array");
        int[] arrayangka5 = new int[8];
        printarray(arrayangka5);
        Arrays.fill(arrayangka5, 3);
        printarray(arrayangka5);
        System.out.println("\n");
        System.out.println("\n");

        // konparasi array
        System.out.println("konparasi array");
        int[] arrayangka6 = { 1, 4, 3, 4, 5, 6, 7, 4 };
        int[] arrayangka7 = { 1, 9, 3, 4, 5, 6, 7, 8 };

        // membandingkan antara dua buah array
        System.out.println("membangkan dua buah array");
        System.out.println(Arrays.equals(arrayangka6, arrayangka7));
        // bisa juga menggunaka if contoh
        if (Arrays.equals(arrayangka6, arrayangka7)) {
            System.out.println("array ini sama");
        } else {
            System.out.println("array ini tidak sama");
        }

        // mengecek array yang lebih besar dengan menggunakan (compare)
        System.out.println("menecek array yang lebih besar");
        System.out.println(Arrays.compare(arrayangka6, arrayangka7));

        // mengecek index yang berbeda menggunaka mismatch
        System.out.println("indec yang berbeda");
        System.out.println(Arrays.mismatch(arrayangka6, arrayangka7));

        // ketika kita serch array terlebih dahulu kita harus sort array contoh
        System.out.println("sort array sebelum di serch");
        int[] arrayangka8 = { 111, 12, 13, 14, 15, 16 };
        printarray(arrayangka8);
        Arrays.sort(arrayangka8);
        printarray(arrayangka8);
        System.out.println("baru di serch");
        int angka = 9;
        int lokasi = Arrays.binarySearch(arrayangka8, angka);
        System.out.println("angka " + angka + " ada di index " + lokasi);

    }

    private static void printarray(int[] dataarray) {
        System.out.println("array" + Arrays.toString(dataarray));
    }

}
