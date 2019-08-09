import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int r =0;
        for(int k =0; k < n; k++) {
            r = r^Integer.parseInt(sc.readLine());
        }
        System.out.println(r);
    }
}
