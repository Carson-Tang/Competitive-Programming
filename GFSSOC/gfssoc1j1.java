import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Integer [] x = new Integer[m];
        int c = 0;
        for(int i = 0; i <m; i++) {
            x[i] = sc.nextInt();
        }
        for(int j = 0; j < m; j++) {
            if(n <= x[j]){
                c++;
            }
        }
        System.out.println(c);
    }
}
