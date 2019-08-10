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
            x[i] = Integer.parseInt(tokens[0]);
            y[i] = Integer.parseInt(tokens[1]);
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.println((x[n-1]-x[0]) * (y[n-1]-y[0]));
    }
}
