import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int a=0,b=0,c=0,d=0;
        for(int i = 0; i < 2*n; i++){
            String s = sc.readLine();
            for(int k = 0; k < 2*n; k++){
                if(i<n){
                    if(k<n){
                        if(s.charAt(k)=='g'){
                            a++;
                        }
                    } else {
                        if(s.charAt(k)=='g'){
                            b++;
                        }
                    }
                } else {
                    if(k<n){
                        if(s.charAt(k)=='g'){
                            c++;
                        }
                    } else {
                        if(s.charAt(k)=='g'){
                            d++;
                        }
                    }
                }
            }
        }
        if(b>=a && b>=c && b >=d){
            System.out.println(1);
        } else if (a>=b && a>=c && a>=d){
            System.out.println(2);
        } else if (c>=a && c>=b && c >=d){
            System.out.println(3);
        } else if (d>=a && d>=b && d>=c){
            System.out.println(4);
        }
    }
}
