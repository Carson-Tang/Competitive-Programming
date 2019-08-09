import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String [] x = new String[n];
        String [] y = new String[m];
        for(int i = 0; i < n; i ++){
            x[i]= sc.nextLine();
        }
        for(int k = 0; k < m; k++){
            y[k]= sc.nextLine();
        }
        for(int j = 0; j < n; j++) {
            for(int l = 0; l < m; l++) {
                System.out.println(x[j] + " as " + y[l]);
            }
        }
    }
}
