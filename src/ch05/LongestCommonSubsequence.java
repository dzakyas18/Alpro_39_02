package ch05;

public class LongestCommonSubsequence {

    int lcs( char[] x, char[] y, int i, int j )
    {
        if (i == 0 || j == 0)
            return 0;
        if (x[i-1] == y[j-1])
            return 1 + lcs(x, y, i-1, j-1);
        else
            return max(lcs(x, y, i, j-1), lcs(x, y, i-1, j));
    }
    int max(int x, int y)
    {
        return (x > y)? x : y;
    }


    public static void main(String[] args)
    {
        LongestCommonSubsequence lcs = new LongestCommonSubsequence();
        String s1 = "ALPRO";
        String s2 = "DASPRO";
        char[] x=s1.toCharArray();
        char[] y=s2.toCharArray();
        int i = x.length;
        int j = y.length;
        System.out.println("LCS = " + lcs.lcs( x, y, i, j ) );
    }
}
