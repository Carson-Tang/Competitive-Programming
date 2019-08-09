import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = 2;
        int c=0;
        while(n>=m && n>=0 && m>= 0) {
            t++;
            c=n-m;
            n=m;
            m=c;
        }
        System.out.println(t);
    }
}
