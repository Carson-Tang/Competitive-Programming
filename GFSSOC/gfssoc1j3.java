import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tokens = sc.readLine().split(":");
        String [] tokens2 = sc.readLine().split(":");
        int d1 = Integer.parseInt(tokens[2]) + Integer.parseInt(tokens[1])*60 + Integer.parseInt(tokens[0])*3600;
        int d2 = Integer.parseInt(tokens2[2]) + Integer.parseInt(tokens2[1])*60 + Integer.parseInt(tokens2[0])*3600;
        int t = d2-d1;
        System.out.println(t);
    }
}
