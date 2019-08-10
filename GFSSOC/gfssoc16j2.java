import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        double x=0;
        for(int i = 0; i < 6; i++) {
            x +=Integer.parseInt(sc.readLine());
        }
        double avg = x/6;
        int f = (int)Math.round(avg);
        f += Integer.parseInt(sc.readLine());
        int r = Integer.parseInt(sc.readLine());
        if(f>=r){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
