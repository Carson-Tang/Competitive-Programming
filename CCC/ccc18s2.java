import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Integer [][] x = new Integer[n][n];
        for(int i = 0; i < n; i++){
            String [] tok = sc.readLine().split(" ");
            for(int k = 0; k < n; k++){
                x[i][k] = Integer.parseInt(tok[k]);
            }
        }
        if((x[0][0]<x[0][1])&&(x[0][0]<x[1][0])){
            for (int i = 0; i < n; i++) {
                for (int k = 0; k < n; k++) {
                    System.out.print(x[i][k]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        } else if ((x[0][0]>x[0][1])&&(x[0][0]<x[1][0])){
            for (int i = n-1; i >= 0; i--) {
                for (int k = 0; k < n; k++) {
                    System.out.print(x[k][i]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        } else if ((x[0][0]>x[0][1])&&(x[0][0]>x[1][0])){
            for (int i = n-1; i >=0; i--) {
                for (int k = n-1; k >= 0; k--) {
                    System.out.print(x[i][k]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        } else {
            for (int i = 0; i <n; i++) {
                for (int k = n-1; k >=0; k--) {
                    System.out.print(x[k][i]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }
}
