import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]), m = Integer.parseInt(tok[1]);
        String [] tok2 = br.readLine().split(" ");
        String [] tok3 = br.readLine().split(" ");
        int [] x = new int[n];
        int [] y = new int[m];
        for(int i = 0; i < n; i++) x[i] = Integer.parseInt(tok2[i]);
        for(int i = 0; i< m; i++) y[i] = Integer.parseInt(tok3[i]);
        System.out.println(lcs(x,y,n,m));
    }
    public static int lcs(int [] x, int [] y, int n, int m){
        int [][] z = new int[n+1][m+1];
        for(int i = 0; i <= n ; i++){
            for(int k = 0; k <= m; k++){
                if(i==0||k==0){
                    z[i][k]=0;
                } else if (x[i-1]==y[k-1]){
                    z[i][k] = z[i-1][k-1]+1;
                } else {
                    z[i][k] = Math.max(z[i-1][k],z[i][k-1]);
                }
            }
        }
        return z[n][m];
    }
}
