import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        if(s.length()>1) System.out.println(999999998);
        else {
            int n = Character.getNumericValue(s.charAt(0));
            if (n == 1) {
                System.out.println(9);
            } else if (n == 2) {
                System.out.println(18);
            } else {
                long sum;
                if (n % 2 == 0) {
                    sum = 2 * (long) (Math.pow(10, n / 2) - 1);
                } else {
                    sum = 11 * (long) (Math.pow(10, (n - 1) / 2)) - 2;
                }
                System.out.println(sum);
            }
        }
    }
}
