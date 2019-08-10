import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int c;
        for(int i = 0; i < n; i++) {
            c=sc.nextInt();
            if(c-100 <= a && a <= c+100){
                System.out.println("fite me! >:3");
            } else {
                System.out.println("go away! 3:<");
            }
        }
    }
}
