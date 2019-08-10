import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = sc.readLine().split(" ");
        int t = Integer.parseInt(tokens[0]);
        int c =1;
        while (true) {
            if(tokens[c].equals("P")){
                t+=Integer.parseInt(tokens[c+1]);
            } else if (tokens[c].equals("M")) {
                t-=Integer.parseInt(tokens[c+1]);
            } else if (tokens[c].equals("=")){
                System.out.println(t);
                break;
            }
            c+=2;
        }
    }
}
