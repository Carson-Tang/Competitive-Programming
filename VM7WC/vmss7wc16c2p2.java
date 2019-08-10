import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        int n = Integer.parseInt(sc.readLine());
        Integer [] total = new Integer[s.length()];
        int g =0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='G'){
                g++;
            }
            total[i] = g;
        }
        for(int i = 0; i < n; i++) {
            String [] tokens = sc.readLine().split(" ");
            int a = Integer.parseInt(tokens[0]);
            int b = Integer.parseInt(tokens[1]);
            if(s.charAt(a)=='G'){
                System.out.println(total[b]-total[a]+ 1);
            } else {
                System.out.println(total[b]-total[a]);
            }
        }
    }
}
