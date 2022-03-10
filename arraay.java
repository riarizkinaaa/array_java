import java.util.Arrays;

class arraay {
    public static void main(String[] args) {

        // array adalah kumpulan data primitif
        /*
         * data primitif contohnya
         * int a=10;
         * int b=20;
         */
        // array mempunyai index yang di mulai dari 0

        // penulisan pada java menggunakan stack(berurutan),sedangka pada array
        // menggunakan heap(tidak berurutan)
        /*
         * penulisan array:
         * tipe data []nama bebas={
         * 
         * } contohnya sebagai berikut
         */
        System.out.println("assigment");
        int[] angka = { 1, 2, 3, 4, 5, 6 };
        angka[3] = 10;
        // untuk menampilkan isi dari array sebagai berikut:
        // System.out.println(angka[0]);
        // System.out.println(angka[1]);
        // System.out.println(angka[2]);
        // System.out.println(angka[3]);
        // System.out.println(angka[4]);
        // System.out.println(angka[5]);
        System.out.println(Arrays.toString(angka));/*
                                                    * <--ini untuk menampilkan isi array
                                                    * secara sederhana dengan cara menuliskan import java.util.Arrays
                                                    * di atas class
                                                    */

        // deklarasi pada array
        /* tipe data[]nama=new tipedata(jumlah array) */
        System.out.println("deklarasi");
        float[] nilai = new float[5];
        nilai[4] = 4.0f;
        nilai[0] = 8.0f;// cara mengisi array yang di buat baru
        nilai[3] = 5.0f;
        // System.out.println(nilai[0]);
        // System.out.println(nilai[1]);
        // System.out.println(nilai[2]);
        // System.out.println(nilai[3]);
        // System.out.println(nilai[4]);
        System.out.println(Arrays.toString(nilai));
        /*
         * import java.util.arrays -->untuk menggunakan String
         * dan penulisannya sebagai berikut:
         * sysout(arrays.toString(nma babas));
         */
        double[] hasil = new double[4];
        hasil[2] = 3.9d;
        hasil[0] = 3.3d;
        System.out.println(Arrays.toString(hasil));

    }
    // kita juga bisa membuat fungsi tanpa menuliskan sysout(Array.toString);

}