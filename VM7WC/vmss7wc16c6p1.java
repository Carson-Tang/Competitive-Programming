import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Integer [] x = new Integer[n+1];
        Integer [] y = new Integer[n+1];
        String [] start = sc.readLine().split(" ");
        x[n] = Integer.parseInt(start[0]);
        y[n] = Integer.parseInt(start[1]);
        x[0] = Integer.parseInt(start[0]);
        y[0] = Integer.parseInt(start[1]);
        for(int i = 1; i < n; i++){
            String [] tok = sc.readLine().split(" ");
            x[i] = Integer.parseInt(tok[0]);
            y[i] = Integer.parseInt(tok[1]);
        }
        double first = 0;
        for(int i = n; i >0; i--){
            first += x[i] * y[i-1];
        }
        double second = 0;
        for(int i = n; i > 0; i--){
            second += y[i] * x[i-1];
        }
        System.out.println((int)Math.ceil(Math.abs(first-second)/2));
    }
}
