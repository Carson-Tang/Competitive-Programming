import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Long [] village = new Long[n];
        for(int i = 0; i < n; i++){
            village[i] = Long.parseLong(sc.readLine());
        }
        Arrays.sort(village);
        ArrayList<Double> x = new ArrayList<>();
        for(int i = 0; i < n-1; i++){
            x.add((double)(village[i+1] + village[i])/2);
        }
        ArrayList<Double> z = new ArrayList<>();
        for(int i =0; i < n-2; i++){
            z.add(x.get(i+1) - x.get(i));
        }
        Collections.sort(z);
        System.out.println(String.format("%.1f",z.get(0)));
    }
}
