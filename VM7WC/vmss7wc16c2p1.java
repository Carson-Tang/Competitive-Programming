import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());

        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                System.out.print("GGGGG");
            }
            System.out.println("");
        }



        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                System.out.print("G");
            }
            for(int j = 0; j < 4*n; j++){
                System.out.print(".");
            }
            System.out.println("");
        }



        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                System.out.print("G");
            }
            for(int j = 0; j < 2*n; j++){
                System.out.print(".");
            }
            for(int e = 0; e < 2*n; e++){
                System.out.print("G");
            }
            System.out.println("");
        }



        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                System.out.print("G");
            }
            for(int j = 0; j < n*3; j++){
                System.out.print(".");
            }
            for(int e = 0; e < n; e++){
                System.out.print("G");
            }
            System.out.println("");
        }



        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                System.out.print("GGGGG");
            }
            System.out.println("");
        }
    }
}
