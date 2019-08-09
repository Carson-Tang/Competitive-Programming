import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==1){
            int a = sc.nextInt();
            Integer [] y = new Integer[a];
            Integer [] z = new Integer[a];
            for(int i=0; i <a; i++){
                y[i] = sc.nextInt();
            }
            for(int k=0; k <a; k++){
                z[k] = sc.nextInt();
            }
            Arrays.sort(y);
            Arrays.sort(z);
            int sum=0;
            for(int j = 0; j < a; j++) {
                if(y[j]>z[j]){
                    sum+= y[j];
                } else {
                    sum+= z[j];
                }
            }
            System.out.println(sum);
        } else {
            int l = sc.nextInt();
            Integer [] x = new Integer[l*2];
            for(int i = 0; i < l*2; i++) {
                x[i] = sc.nextInt();
            }
            Arrays.sort(x);
            int s=0;
            for(int k = x.length-1; k >= l ; k--){
                s+=x[k];
            }
            System.out.println(s);
        }
    }
}
