import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a,b,c,d;
        for(int i = 0; i < n; i++){
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            d=sc.nextInt();
            if(b<=a-d && c>=a-d) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
