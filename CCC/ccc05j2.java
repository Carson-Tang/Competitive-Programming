import java.io.*;
import java.util.*;

public class Main {
    public static int n = 0;
    public static int c = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            c=0;
            if (rsa(i)) {
                n++;
            }
        }
        System.out.println("The number of RSA numbers between " + a + " and " + b + " is " + n);
    }

    public static boolean rsa(int i) {
        for (int k = 2; k < i; k++) {
            if (i % k == 0) {
                c++;
            }
        }
        if (c == 2) {
            return true;
        } else {
            return false;
        }
    }
}
