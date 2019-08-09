import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = sc.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        int c = 0;
        Map<String, Integer> x = new HashMap<>();
        String [] tokn = sc.readLine().split(" ");
        String [] token = sc.readLine().split(" ");
        for(int i =0; i < n; i++){
            x.put(tokn[i],1);
        }
        for(int i = 0; i < m; i++){
            if(x.get(token[i])!=null){
                c++;
                x.put(token[i],null);
            }
        }
        System.out.println(c);
    }
}
