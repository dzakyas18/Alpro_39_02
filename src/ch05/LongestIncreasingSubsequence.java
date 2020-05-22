package ch05;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        int[] arr = { 10, 15, 9, 26, 21, 47, 41, 60 };
        int n = arr.length;

            int[] lis = new int[n];
            int i, j, max = 0;

            for (i = 0; i < n; i++)
                lis[i] = 1;

            for (i = 1; i < n; i++)
                for (j = 0; j < i; j++)
                    if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                        lis[i] = lis[j] + 1;

            for (i = 0; i < n; i++)
                if (max < lis[i])
                    max = lis[i];
            System.out.println("LIS = "+max);


        }


    }
