import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int t = 0;
        while(n>0){
            n--;
            a++;
            t++;
            if(a==35){
                n+=30;
                a=0;
            } else if (n==0){
                break;
            }
            n--;
            b++;
            t++;
            if(b==100){
                n+=60;
                b=0;
            } else if(n==0) {
                break;
            }
            n--;
            c++;
            t++;
            if(c==10){
                n+=9;
                c=0;
            } else if(n==0){
                break;
            }
        }
        System.out.println("Martha plays " + t + " times before going broke.");
    }
}
