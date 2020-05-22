package Responsi10;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 0; i < arrayAngka.length; i++) {
            int urutan = arrayAngka [i];
            int j = i-1;

            while (j >= 0 && arrayAngka[j] > urutan) {
                arrayAngka [j+1] = arrayAngka[j];
                arrayAngka[j] = urutan;
                j = j-1;
            }
        }
        for (int i = 0; i < arrayAngka.length; i++) {
            System.out.println(arrayAngka[i]);
        }
    }
}

