import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n,c=0; double f=0;
        for(int i = 0; i< 10; i++) {
            String [] tok = sc.readLine().split(" ");
            double t = Double.parseDouble(tok[0])/100;
            double a = Double.parseDouble(tok[1])/100;
            double p = Double.parseDouble(tok[2])/100;
            double q = Double.parseDouble(tok[3])/100;
            n = Integer.parseInt(sc.readLine());
            for(int k = 0; k< n; k++){
                String [] tokens = sc.readLine().split(" ");
                f += Double.parseDouble(tokens[0]) * t;
                f += Double.parseDouble(tokens[1]) * a;
                f += Double.parseDouble(tokens[2]) * p;
                f += Double.parseDouble(tokens[3]) * q;
                if(f>=49.9){
                    c++;
                }
                f=0;
            }
            System.out.println(c);
            c=0;
        }
    }
}
