import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String [] space = new String[(n-2)/2 + 1];
        String s = " ";
        for(int i = 0; i < (n-2)/2 + 1; i++) {
            space [i] = s;
            s += "  ";
        }
        String [] line = new String[(n-2)/2 + 1];
        String l = "*";
        for(int i = (n-2)/2 + 1; i > 0; i--){
            line[i-1] = l;
            l += "*";
        }
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 0; i < (n-2)/2 + 1; i++){
            System.out.print(line[i] + space[i] + line[i]);
            System.out.println();
        }
        for(int i = (n-2)/2 - 1; i >= 0; i--){
            System.out.print(line[i] + space[i] + line[i]);
            System.out.println();
        }
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
    }
}
