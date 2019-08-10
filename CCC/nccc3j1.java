import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int s = 0;
        for(int i = 0; i < n; i++) {
            int a = Integer.parseInt(sc.readLine());
            if(a!=0){
                s+=a;
            }
        }
        System.out.println(s);
    }
}
