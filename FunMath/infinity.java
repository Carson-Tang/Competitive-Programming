import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException  {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        String s1 = sc.readLine();
        long a = Integer.parseInt(s, 16);
        long b = Integer.parseInt(s1, 16);
        if (a+b> 1061109567){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
