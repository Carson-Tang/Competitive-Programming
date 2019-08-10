import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]), q = Integer.parseInt(tok[1]);
        String [] tok2 = br.readLine().split(" ");
        int [] prefixsum = new int[n+1];
        for(int i = 1; i < n+1; i++){
            prefixsum[i] = prefixsum[i-1] + Integer.parseInt(tok2[i-1]);
        }
        for(int i = 0; i < q; i++){
            String [] tok3 = br.readLine().split(" ");
            int a = Integer.parseInt(tok3[0]), b = Integer.parseInt(tok3[1]);
            a-=1;
            System.out.println(prefixsum[n] - prefixsum[b] + prefixsum[a]);
        }
    }
}
