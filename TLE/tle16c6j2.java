import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = sc.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int d = Integer.parseInt(tok[1]);
        long t =0;
        Integer [] x = new Integer[n];
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(sc.readLine());
        }
        Arrays.sort(x);
        int a=1;
        long y = 1;
        for(int i = d-1; i >=0; i--) {
            for(int k = 0; k < a; k++){
                y *= x[i];
                y = y % 1000000007;
            }
            t += y;
            y=1;
            a++;
        }
        System.out.println(t%1000000007);
    }
}
