import java.util.Arrays;

public class array2Dimensi {
    public static void main(String[] args) {
        // menggunakan array 2 dimensi dengan assigment
        System.out.println("array 2 dimendi dengan assigment");
        int[][] arrayangka1 = { /*
                                 * penulisan array 2 dimensi seperti
                                 * tipedaa[][]nama bebas
                                 */
                { 1, 2, 3 },
                { 4, 5, 6 },
        };
        printarray(arrayangka1);

        // array 2 dimensi dengan deklasasi
        System.out.println("array 2 dimendi dengan deklarasi");
        // 5 adala baris,sedangkan 4 adalah kolom
        int[][] arrayangka2 = new int[5][4];/*
                                             * cara membuat array baru ,maka akan mempunyai
                                             * 5 baris dan 4 kolom yang isinya masih kosong
                                             */
        arrayangka2[3][2] = 10;
        printarray(arrayangka2);
    }

    private static void printarray(int[][] dataaray) {
        for (int i = 0; i < dataaray.length; i++) {
            System.out.println(Arrays.toString(dataaray[i]));/*
                                                              * jika [i]tidak ada
                                                              * maka output nya akan menghasilkan alamat nya saja
                                                              */
        }
    }

}
