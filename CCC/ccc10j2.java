import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int s = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        Integer [] x = new Integer[4];
        x[0] = a;
        x[1] = b;
        x[2] = c;
        x[3] = d;
        for(int i = 0; i < s; i++) {
            if(a>0) {
                sum1 ++;
                a--;
                if(a==1){
                    b = x[1];
                }
            }else if (b>0){
                sum1 --;
                b--;
                if(b==0){
                    a = x[0];
                }
            }
            if (c>0){
                sum2 ++;
                c--;
                if(c==1){
                    d = x[3];
                }
            }
            else if (d>0) {
                sum2 --;
                d--;
                if(d==0){
                    c = x[2];
                }
            }
        }
        if(sum1>sum2){
            System.out.println("Nikky");
        } else if (sum1<sum2) {
            System.out.println("Byron");
        } else {
            System.out.println("Tied");
        }
    }
}
