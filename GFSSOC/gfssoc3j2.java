import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        double c = Double.parseDouble(sc.readLine());
        if(c==0){
            System.out.println("Fardin's broke");
            return;
        }
        double t=0;
        for(int i = 0; i < n; i++) {
            t+=Double.parseDouble(sc.readLine());
            if(c<t){
                System.out.println("Fardin's broke");
                return;
            }
        }
        c = Math.round((c-t)*100);
        c /= 100;
        if(c==0){
            System.out.println("0.00");
        } else {
            System.out.println(c);
        }
    }
}
