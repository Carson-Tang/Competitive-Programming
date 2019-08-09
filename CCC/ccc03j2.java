import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> x = new ArrayList<>();
        Map<Integer, Integer> y = new HashMap<>();
        Map<Integer, Integer> z = new HashMap<>();
        while(true){
            int c = Integer.parseInt(sc.readLine());
            if(c==0){
                break;
            }
            for(int i = 1; i <= c; i++){
                for(int k = c/i; k >= 1; k--){
                    if(c%i==0){
                        if(i*k==c){
                        x.add(2*i + 2*k);
                        y.put(2*i+2*k, i);
                        z.put(2*i+2*k, k);
                    }
                    }
                }
            }
            Collections.sort(x);
            Collections.reverse(x);
            System.out.println("Minimum perimeter is " + (y.get(x.get(x.size()-1)) * 2 + z.get(x.get(x.size()-1))*2 + " with dimensions" +
                    " " + y.get(x.get(x.size()-1)) + " x " + z.get(x.get(x.size()-1))));
            x.clear();
            y.clear();
            z.clear();
        }
    }
}
