import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] sum1 = new int[n];
        int [] sum2 = new int[n];
        int t1 =0;
        int t2 = 0;
        int t = 0;
        for(int i = 0; i < n; i++) {
            sum1[i] = sc.nextInt();
        }
        for(int k = 0; k < n; k++) {
            sum2[k] = sc.nextInt();
        }
        for(int j = 0; j < n; j++) {
            t1 += sum1[j];
            t2 += sum2[j];
            if(t1==t2)
            {
                t = j + 1;
            }
        }
        System.out.println(t);
    }
}
