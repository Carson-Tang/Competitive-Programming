import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        Integer [] x = new Integer[21];
        for(int i = 1; i <=21; i++) {
            x[i-1] = (int)Math.pow(i,6);
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c=0;
        for(int j = 0; j < 21; j++) {
            if(x[j]>=a && x[j]<=b){
                c++;
            }
        }
        System.out.println(c);

    }
}
