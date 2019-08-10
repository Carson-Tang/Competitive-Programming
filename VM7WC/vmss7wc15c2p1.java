import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer []x =  new Integer[n];
        for(int k = 0; k < n; k++) {
            x[k] = sc.nextInt();
        }
        int u=0;
        if(x[0]<=41 && x[1]<=41){
            u++;
        }
        if(x[n-1]<=41 && x[n-2]<=41){
            u++;
        }
        for(int i = 1; i < x.length-1; i++) {
            if(x[i-1] <=41 && x[i]<=41 && x[i+1]<=41){
                u++;
            }
        }
        System.out.println(u);
    }
}
