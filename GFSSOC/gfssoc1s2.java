import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Map<String, String> x = new HashMap<>();
        String[] y = new String[n];
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.readLine().split(" ");
            x.put(tokens[1], tokens[0]);
            y[i] = tokens[1];
        }
        String [] tokens = sc.readLine().split(" ");
        tokens[tokens.length-1] = tokens[tokens.length-1].replace(Character.toString('.'),"");
        String [] z = new String [tokens.length];
        for(int k = 0; k < tokens.length; k++) {
            if(x.get(tokens[k])!=null) {
                z[k] = x.get(tokens[k]);
            } else {
                z[k] = tokens[k];
            }
        }
        for(int t = 0; t < z.length; t++){
            if(t==z.length-1){
                System.out.print(z[t] + ".");
            } else {
                System.out.print(z[t] + " ");
            }
        }
    }
}
