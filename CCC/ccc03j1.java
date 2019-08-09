import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        int s = Integer.parseInt(sc.readLine());
        int h = Integer.parseInt(sc.readLine());
        for(int j = 0; j < t; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print("*");
                for (int k = 0; k < s; k++) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        for(int a = 0; a < s*2+3; a++){
            System.out.print("*");
        }
        System.out.println("");
        for(int c = 0; c < h; c++) {
            for (int b = 0; b < s*2+3; b++) {
                if (b == s + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}
