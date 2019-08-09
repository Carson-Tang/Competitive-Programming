import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int k = Integer.parseInt(sc.readLine());
        int s = n;
        for(int i = 1; i <= k; i++) {
            s+=n*Math.pow(10,i);
        }
        System.out.println(s);
    }
}
