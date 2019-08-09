import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int max1=0;
        for(int i = 0; i < c; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a*b>max1){
                max1 = a*b;
            }
        }
        int n = sc.nextInt();
        int max2=0;
        for(int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a*b>max2){
                max2 = a*b;
            }
        }
        if(max1>max2) {
            System.out.println("Casper");
        } else if (max2>max1){
            System.out.println("Natalie");
        } else {
            System.out.println("Tie");
        }
    }
}
