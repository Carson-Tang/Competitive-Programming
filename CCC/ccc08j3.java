import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        Character [][] x = new Character[5][6];
        String z = "ABCDEFGHIJKLMNOPQRSTUVWXYZ -.?";
        int a =0;
        for(int i = 0; i < 5; i++){
            for(int k = 0; k < 6; k++){
                x[i][k] = z.charAt(a);
                a++;
            }
        }
        int c= 0;
        int xv = 0;
        int yv = 0;
        for(int i =0; i < s.length(); i++){
            for(int k = 0; k < 5; k++){
                for(int j = 0; j < 6; j++){
                    if(x[k][j]==s.charAt(i)){
                        c += Math.abs(xv - k) + Math.abs(yv - j);
                        xv = k;
                        yv = j;
                    }
                }
            }
        }
        c += Math.abs(xv - 5) + Math.abs(yv - 4);
        System.out.println(c);
    }
}
