import java.io.*;
import java.util.*;

public class Main {
    static int [][][] dp;
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k = sc.nextInt();
        dp = new int[n+1][n+1][n+1];
        System.out.println(recur(1,n,k));
    }
    public static int recur (int min, int n, int k){
        if(n==0&&k==0) return 1;
        if(n==0||k==0) return 0;
        if(dp[min][n][k]==0) {
            int way = 0;
            for (int i = min; i <= n/k; i++) {
                way += recur(i, n - i, k - 1);
            }
            dp[min][n][k] = way;
        }
        return dp[min][n][k];
    }
}
