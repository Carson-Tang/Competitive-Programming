import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [][] grid = new int[n+1][n+1];
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            for(int k = 0; k <= i; k++){
                grid[i][k]=Integer.parseInt(tok[k]);
            }
        }
        for(int i = 0; i < n; i++){
            for(int k = 0; k < i+1; k++){
                if(!(i==0 && k==0)){
                    if(k==0){
                        grid[i][k] += grid[i-1][k];
                    } else if (i==k){
                        grid[i][k] += grid[i-1][k-1];
                    } else {
                        grid[i][k]=Math.max(grid[i][k]+grid[i-1][k],grid[i][k]+grid[i-1][k-1]);
                    }
                }
            }
        }
        int max=0;
        for(int i = 0; i < n; i++){
            if(grid[n-1][i]>max){
                max=grid[n-1][i];
            }
        }
        System.out.println(max);
    }
}
