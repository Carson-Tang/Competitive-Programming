import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String s;
        for(int i = 0; i < n; i++){
            s=sc.readLine();
            System.out.println(s.length());
        }
    }
}
