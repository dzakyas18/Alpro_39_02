package ch09;

import java.util.Arrays;
import java.util.Scanner;

public class SieveOfSundaram {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Masukkan batas angka yang dicari = ");
        int angka = Input.nextInt();
        int n = (angka - 2) / 2;
        
        boolean prima[] = new boolean[n + 1];
        Arrays.fill(prima, false);
        for (int i = 1; i <= n; i++)
            for (int j = i; (i + j + 2 * i * j) <= n; j++)
                prima[i + j + 2 * i * j] = true;

        //2 termasuk bilangan prima
        if (angka > 2)
            System.out.print(2 + " ");
        for (int i = 1; i <= n; i++)
            if (prima[i] == false)
                System.out.print(2 * i + 1 + " ");

    }

}

