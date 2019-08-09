import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Integer[] x = new Integer[n];
        for (int i = 0; i < n; i++) {
            x[i] = Integer.parseInt(sc.readLine());
        }
        for (int i = 0; i < n; i++) {
            if(type(x[i]).equals("abundant")){
                System.out.println(x[i] + " is an " + type(x[i]) + " number.");
            } else {
                System.out.println(x[i] + " is a " + type(x[i]) + " number.");
            }
        }
    }

    public static String type(int n) {
        int s = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                s += i;
                if (s > n) {
                    return "abundant";
                }
            }
        }
        if (s == n) {
            return "perfect";
        } else if (s < n) {
            return "deficient";
        }
        return "";
    }
}
