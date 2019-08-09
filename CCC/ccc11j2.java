import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int h = Integer.parseInt(sc.readLine());
        int m = Integer.parseInt(sc.readLine());
        for(int i = 1 ; i <= m; i++) {
            if((-6)*i*i*i*i + h*i*i*i + 2*i*i + i <=0) {
                System.out.println("The balloon first touches ground at hour: ");
                System.out.println(i);
                break;
            } else if (i==m) {
                System.out.println("The balloon does not touch ground in the given time.");
            }
        }
    }
}
