import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int f = Integer.parseInt(sc.readLine());
        int c = 0;
        for(int i = 0; i< f; i++) {
            String [] tok = sc.readLine().split(" ");
            for(int k = Integer.parseInt(tok[0]); k < Integer.parseInt(tok[1]); k++){
                if(isPrime(k)){
                    c++;
                }
            }
            System.out.println(c);
            c=0;
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        if(n<=3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        if(n!=5){
            if(n%5==0){
                return false;
            }
        }
        if(n%Math.sqrt(n)==0){
            return false;
        }
        for(int i = 5; i*i<n; i+=6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}
