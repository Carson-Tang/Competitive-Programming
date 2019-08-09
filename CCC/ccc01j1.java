import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int a =1;
        boolean b = true;
        for(int i = 0; i < n; i++) {
            for(int k = 1; k <= a; k++){
                System.out.print("*");
            }
            for(int j = 0; j < n*2-a*2; j++){
                System.out.print(" ");
            }
            for(int e = 1; e <= a; e++){
                System.out.print("*");
            }
            if(a<n && b){
                a+=2;
            } else {
                b=false;
            }
            if(!b){
                a-=2;
            }
            System.out.println("");
        }
    }
}
