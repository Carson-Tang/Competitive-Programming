import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[]x = {0,100,500,1000,5000,10000,25000,50000,100000,500000,1000000};
        for(int i = 0; i < n; i++) {
            int o = sc.nextInt();
            x[o] = 0;
        }
        int sum = 0;
        for(int j = 0; j < 11; j++) {
            sum += x[j];
        }
        int b = sc.nextInt();
        if(sum/(10-n)<b) {
            System.out.println("deal");
        }else {
            System.out.println("no deal");
        }
    }
}
