import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        if(n%d==0) {
            System.out.println(n/d);
        } else if (n==0) {
            System.out.println(0);
        } else if(d>n) {
            GCF((n%d),d);
        } else if (n % d != 0) {
                if (d % (n % d) == 0) {
                    System.out.print((n / d) + " ");
                    GCF((n % d), d);
                }
            } else {
                System.out.println((n / d) + " " + (n % d) + "/" + d);
            }

    }
    public static void GCF (int x, int y) {
        int m;
        if (x>y) {
            m=y;
        } else {
            m=x;
        }
        int t = 0;
        for(int i = 1 ; i <= m; i++) {
            if(x%i==0 && y%i==0) {
                t = i;
            }
        }
        System.out.print((x/t) + "/" + (y/t));
    }
}
