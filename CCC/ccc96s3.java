import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String f = "";
        String t = "";
        String z = "";
        int n,k;
        int b;
        for(int i = 0; i < a; i++){
            String [] tok = br.readLine().split(" ");
            n = Integer.parseInt(tok[0]);
            k = Integer.parseInt(tok[1]);
            for(int j = 0; j < k; j++){
                f += "1";
            }
            for(int j = 0; j < n-k; j++){
                f += "0";
            }
            z = f;
            b = f.lastIndexOf("10");
            System.out.println("The bit patterns are");
            while(b!=-1){
                System.out.println(f);
                for(int e = 0; e < b; e++){
                    t += f.charAt(e);
                }
                t += "01";
                for(int e = f.length()-1; e >= b+2; e--){
                    t += f.charAt(e);
                }
                f = t;
                t = "";
                b = f.lastIndexOf("10");
            }
            for(int j = z.length()-1; j >= 0; j--){
                System.out.print(z.charAt(j));
            }
            System.out.println();
            f="";
            t="";
            z="";
        }
    }
}
