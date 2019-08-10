import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Integer [] x = new Integer[n];
        Integer [] y = new Integer[n];
        for(int i = 0; i < n; i++) {
            String [] tokens = sc.readLine().split(" ");
            for(int k = 0; k < n; k++) {
                y[k]= Integer.parseInt(tokens[k]);
            }
            Arrays.sort(y);
            x[i] = y[(n-1)/2];
        }
        Arrays.sort(x);
        System.out.println(x[(n-1)/2]);
    }
}
