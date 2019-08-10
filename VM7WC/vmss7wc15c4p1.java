import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = 0;
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            c+= Math.sqrt(n*n - i*i) + 1;
        }
        System.out.println(c*4 + 1);
    }
}
