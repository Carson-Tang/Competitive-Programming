import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        int c = Integer.parseInt(sc.readLine());
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 0; i < c; i++) {
            x.add(Integer.parseInt(sc.readLine()));
        }
        Collections.sort(x);
        Integer [] y = x.toArray(new Integer[x.size()]);
        int n =0;
        int a = 0;
        while(t-y[a]>=0){
            t-=y[a];
            n++;
            a++;
        }
        System.out.println(n);
    }
}
