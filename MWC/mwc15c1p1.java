import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Integer[]x = new Integer[n];
        for(int i = 0; i < n; i++){
            String [] tokens = sc.readLine().split(" ");
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            x[i] = b + a*60;
        }
        Arrays.sort(x);
        String [] tokens1 = sc.readLine().split(" ");
        int w = Integer.parseInt(tokens1[0]);
        int e = Integer.parseInt(tokens1[1]);
        int f = w*60+e;
        int c=0;
        for(int i = 0; i < n; i++){
            f-=x[i];
            if(f>=0){
                c++;
            } else {
                break;
            }
        }
        System.out.println(c);
    }
}
