import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Map <Integer, Integer> x = new HashMap<>();
        Integer [] y = new Integer[n];
        int a =1;
        for(int i = 1; i <= n; i++){
            String [] tok = sc.readLine().split(" ");
            for(int k = 1; k <= Integer.parseInt(tok[0]); k++) {
                a *= Integer.parseInt(tok[k]);
            }
            x.put(a,i);
            y[i-1] = a;
            a = 1;
        }
        Arrays.sort(y);
        System.out.println(x.get(y[n-1]));
        System.out.println(x.get(y[n-2]));
        System.out.println(x.get(y[n-3]));
    }
}
