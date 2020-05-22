package Responsi10;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arrayAngka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32,3};
        for (int i = 0; i < arrayAngka.length; i++){
            for (int j = 0; j < arrayAngka.length-1;j++){
                boolean urutan = arrayAngka[j] < arrayAngka[j+1];
                if (!urutan){
                    int baru = arrayAngka[j];
                    arrayAngka[j] = arrayAngka [j+1];
                    arrayAngka[j+1] = baru;
                }
            }
        }
        for (int i = 0; i < arrayAngka.length; i++){
            System.out.println(arrayAngka[i]);
        }
    }
}
