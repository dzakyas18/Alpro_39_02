package Responsi10;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < arrayAngka.length-1; i++){
            int terkecil = i;
            for (int j = i+1; j < arrayAngka.length; j++){
                if (arrayAngka[j] < arrayAngka[terkecil]){
                    terkecil = j;
                    int urutan = arrayAngka[terkecil];
                    arrayAngka[terkecil] = arrayAngka [i];
                    arrayAngka[i] = urutan;
                }
            }
        }
        for (int i = 0; i < arrayAngka.length; i++){
        System.out.println(arrayAngka[i]);
        }
    }
}
