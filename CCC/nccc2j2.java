import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = sc.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        Character [][] x = new Character[n][m];
        for(int i = 0; i < n; i++){
            String s = sc.readLine();
            for(int k = 0; k < m; k++){
                x[i][k] = s.charAt(k);
            }
        }
        for(int j = 0; j < 100; j++){
            for(int i = 0; i < n-1; i++){
                for(int k = 0; k < m; k++){
                    if(x[i][k]=='o' && x[i+1][k]=='.'){
                        x[i][k] = '.';
                        x[i+1][k] = 'o';
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                System.out.print(x[i][k]);
            }
            System.out.println();
        }
    }
}
