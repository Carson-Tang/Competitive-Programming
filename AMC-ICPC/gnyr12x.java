import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int d,n,x;
        String s;
        for(int i = 0; i < p; i++){
            d = Integer.parseInt(br.readLine());
            s = br.readLine();
            n = Integer.parseInt(br.readLine());
            x=0;
            String [] tok = br.readLine().split(" ");
            System.out.print(d + " ");
            for(int k = 0; k < n; k++){
                x += Integer.parseInt(tok[k]);
                if(x<0){
                    x += s.length();
                } else if (x>s.length()-1){
                    x %= s.length();
                }
                System.out.print(s.charAt(x));
            }
            System.out.println();
        }
    }
}
