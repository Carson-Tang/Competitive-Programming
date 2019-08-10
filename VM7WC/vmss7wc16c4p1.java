import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer>x = new HashMap<>();
        for(int i = 0; i <=100; i++) {
             x.put(i, i*i);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        for(int k = 0; k<=100; k++) {
            if(x.get(k)>=a && x.get(k)<=b) {
              c++;
            }
        }
        System.out.println(c);
    }
}
