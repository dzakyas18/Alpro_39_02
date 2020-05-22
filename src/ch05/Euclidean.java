package ch05;

import java.util.Scanner;

public class Euclidean {
    public static void main(String[] args) {
        Scanner euclid = new Scanner(System.in);
        System.out.print("Nilai P = ");
        int p = euclid.nextInt();
        System.out.print("Nilai Q = ");
        int q = euclid.nextInt();
        boolean fpb;

        while (p < q){
            System.out.print("Nilai P harus > Q, masukkan nilai kembali \nNilai P = ");
            p = euclid.nextInt();
            System.out.print("Nilai Q = ");
            q = euclid.nextInt();

        }

        int r = p % q;
        while (r != 0){
            p = q;
            q = r;
            r = p % r;
        }
        System.out.println("PBB / FPB = "+q);
    }
}
