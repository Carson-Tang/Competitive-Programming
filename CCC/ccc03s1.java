import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int s = 1;
        boolean valid = false;
        while(s!=100) {
            int n=0;
            while(!valid) {
                n = Integer.parseInt(sc.readLine());
                if(n==0){
                    System.out.println("You Quit!");
                    System.exit(0);
                }
                else if(n>=2 && n<= 12) {
                    valid = true;
                }
            }
            s += n;
            if(s>100) {
                s -= n;
            } else if (s==9) {
                s = 34;
            } else if (s==40) {
                s = 64;
            } else if (s==67) {
                s = 86;
            } else if (s==99) {
                s = 77;
            } else if (s==90) {
                s = 48;
            } else if (s==54) {
                s = 19;
            }
            System.out.println("You are now on square " + s);
            valid = false;
        }
        System.out.println("You Win!");
    }
}
