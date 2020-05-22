package ch09;

import java.util.Scanner;

public class SieveOfEratosthenes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan batas angka yang ingin dicari");
        int batas = input.nextInt();
        System.out.println("Terdapat bilangan prima yaitu :");
        boolean prima[] = new boolean[batas+1];

        for (int i = 0; i <= batas; i++){
            prima [i]= true ;
        }
            //mencari kelipatan dari angka prima yg didapat
            //kemudian dieliminasi
        for (int j = 2; j*j <= batas; j++){
            if (prima[j] == true) {
                for (int i = j*j; i <= batas; i+= j){
                    prima [i] = false;}
            }
        }


        for (int i = 2; i <= batas; i++){
            if (prima[i] == true)
                System.out.print(i+ ", ");
        }
    }
}