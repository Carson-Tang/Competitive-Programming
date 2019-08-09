import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] x = {"A","B","C","D","E","F","G","H","I","J","K",
                "L","M","N","O","P","Q","R","S","T","U","V","W"
        ,"X","Y","Z"};
        String u = sc.next();
        String e="";
        int z = 0;
        for(int i = 0; i < u.length(); i++) {
            for(int k = 0; k < x.length; k++){
                if(String.valueOf(u.charAt(i)).equals(x[k])){
                    z = k + 1;
                }
            }
            int q = 3*(i+1) + n;
            if(z-q<0) {
                e+=x[25 + (z-q)];
            } else if(z-q==0){
                e+= x[25];
            }else {
                e+= x[z-q-1];
            }
        }
        System.out.println(e);
    }
}
