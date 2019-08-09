import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        if(n==0){
            System.exit(0);
        }
        if(n==1){
            String [] tok = sc.readLine().split(" ");
            System.out.println(tok[0]);
            return;
        }
        String [][] x = new String[n][2];
        Long [] y = new Long[n];
        for (int i = 0; i < n; i++) {
            String[] tokens = sc.readLine().split(" ");
            long value = Integer.parseInt(tokens[1]) * 2 + Integer.parseInt(tokens[2]) * 3 + Integer.parseInt(tokens[3]);
            y[i] = value;
            x[i][0] = tokens[0];
            x[i][1] = Long.toString(value);
        }
        Arrays.sort(y);
        long max = y[n-1];
        ArrayList<String> comp = new ArrayList<>();
        ArrayList<String> comp2 = new ArrayList<>();
        for(int i =0; i < n; i++){
            if(Long.parseLong(x[i][1]) == max) {
                comp.add(x[i][0]);
            }
        }
        Collections.sort(comp);
        if(comp.size()>1){
            System.out.println(comp.get(0));
            System.out.println(comp.get(1));
        } else {
            max = y[n-2];
            for(int i =0; i < n; i++){
                if(Long.parseLong(x[i][1]) == max) {
                    comp2.add(x[i][0]);
                }
            }
            Collections.sort(comp2);
            System.out.println(comp.get(0));
            System.out.println(comp2.get(0));
        }
    }
}
