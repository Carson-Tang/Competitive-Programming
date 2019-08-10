import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = sc.readLine().split(" ");
        double m = Double.parseDouble(tok[0]);
        double k = Double.parseDouble(tok[1]);
        double n = Double.parseDouble(tok[2]);
        for(double x = 0; x <= m; x++) {
           if((x+k)/n>=.595){
               if(x>=0){
                   if(x<=m){
                       System.out.println((int)x);
                       System.exit(0);
                   }
               }
           }
        }
        System.out.println("have mercy snew");
    }
}
