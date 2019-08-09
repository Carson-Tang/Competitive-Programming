import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int a;
        String s;
        String b = "0";
        String c = "00";
        String d = "000";
        for (int k = 0; k < n; k++) {
            a = Integer.parseInt(sc.readLine());
            s = Integer.toBinaryString(a);
            if (s.length() % 4 == 1) {
                s = d + s;
            } else if (s.length() % 4 == 2) {
                s = c + s;
            } else if (s.length() % 4 == 3) {
                s = b + s;
            }
            for (int i = 0; i < s.length(); i++) {
                if ((i % 4 == 0)&&(i>0)) {
                    System.out.print(" ");
                }
                System.out.print(s.charAt(i));
            }
            System.out.println("");
        }
    }
}
