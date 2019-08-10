import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = sc.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int c = Integer.parseInt(tok[1]);
        String [] name = new String[n];
        Integer [] x = new Integer[n];
        for(int i = 0; i < n; i++){
            x[i] = 0;
        }
        for(int i = 0; i < n; i++){
            name[i] = sc.readLine();
        }
        for(int i = 0; i < c; i++){
            String [] tok1 = sc.readLine().split(" ");
            for(int k = 0; k < n; k++){
                x[k] = x[k] + Integer.parseInt(tok1[k]);
            }
        }
        Map<Integer, String> y = new HashMap<>();
        for(int i =0; i < n; i++){
            y.put(x[i],name[i]);
        }
        Arrays.sort(x);
        int a = 3;
        for(int i = x.length-1; i >= 0; i--){
            System.out.println(a + ". " + y.get(x[i]));
            a++;
        }
    }
}
