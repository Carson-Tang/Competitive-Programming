import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int [] x = new int[1000001];
        String [] tok = br.readLine().split(" ");
        for(int i = 0; i < k; i++){
            x[Integer.parseInt(tok[i])] = 1;
        }
        int n = Integer.parseInt(br.readLine());
        int [] y = new int[1000001];
        y[0] = 0;
        for(int i = 1; i < 1000001; i++){
            y[i] = y[i-1] + x[i];
        }
        int f;
        for(int i = 0; i < n; i++){
            f = Integer.parseInt(br.readLine());
            System.out.println(f - y[f]);
        }
    }
}
