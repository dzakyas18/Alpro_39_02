package ch09;

import java.util.Scanner;

 public class AKSPrimalityTest {

    static long k[] = new long[100];


    static void koefisien(int n)
    {
        k[0] = 1;
        for (int i = 0; i < n; k[0] = -k[0], i++) {
            k[1 + i] = 1;

            for (int j = i; j > 0; j--)
                k[j] = k[j - 1] - k[j];
        }
    }


    static boolean prima(int n)
    {
        koefisien(n);

        k[0]++;
        k[n]--;
        int i = n;

        while ((i--) > 0 && k[i] % n == 0);

        return i < 0;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka = ");
        int n = input.nextInt();
        if (prima(n))
            System.out.println(n+ " TERMASUK BILANGAN PRIMA");
        else
            System.out.println(n+ " BUKAN BILANGAN PRIMA");
    }
}
