import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(sc.readLine());
        for (int e = 0; e < d; e++) {
            String[] tok = sc.readLine().split(" ");
            int n = Integer.parseInt(tok[1]);
            boolean[] isPrime = new boolean[n + 1];
            for (int i = 2; i <= n; i++) {
                isPrime[i] = true;
            }
            for (int f = 2; f * f <= n; f++) {
                if (isPrime[f]) {
                    for (int j = f; f * j <= n; j++) {
                        isPrime[f * j] = false;
                    }
                }
            }
            int p = 0;
            for (int i = Integer.parseInt(tok[0]); i < n; i++) {
                if (isPrime[i]){
                    p++;
                }
            }
            System.out.println(p);
        }
    }
}
