import java.util.Arrays;

public class sortingNilaiTerbalik {
    public static void main(String[] args) {
        int[] arrayangka1 = { 1, 2, 3, 4, 5 };
        int[] arrayangka2 = { 6, 7, 8, 9, 0 };
        // sorting reverse,mengurutkan dengan nilai terbalik
        System.out.println("sorting reverse");
        printarray(arrayangka1, "hasil1");
        reverse(arrayangka1);
        printarray(arrayangka1, "hasil");

        printarray(arrayangka2, "hasil1");
        reverse2(arrayangka2);
        printarray(arrayangka2, "hasil");
    }

    private static void reverse2(int[] dataarray) {
        Arrays.sort(dataarray);
        int buffer;
        for (int i = 0; i < dataarray.length / 2; i++) {
            buffer = dataarray[i];
            dataarray[i] = dataarray[(dataarray.length - 1) - i];
            dataarray[(dataarray.length - 1) - i] = buffer;
        }
    }

    private static void reverse(int[] dataarray) {
        Arrays.sort(dataarray);
        int[] arraybuffer = Arrays.copyOf(dataarray, dataarray.length);
        for (int i = 0; i < dataarray.length; i++) {
            dataarray[i] = arraybuffer[(arraybuffer.length - 1) - i];
        }
    }

    private static void printarray(int[] dataarray, String massage) {
        System.out.println(massage + "=" + Arrays.toString(dataarray));
    }

}
