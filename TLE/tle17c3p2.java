import java.io.*;
import java.util.*;

public class Main {
   public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int s = Integer.parseInt(tok[0]), k = Integer.parseInt(tok[1]);
        Map<Integer,Integer> x = new HashMap<>();
        for(int i = 1; i <= s; i++){
            x.put(Integer.parseInt(br.readLine()),i);
        }
        long total = 1;
        int last = x.get(Integer.parseInt(br.readLine()));
        for(int i = 1; i < k; i++){
            int cur = x.get(Integer.parseInt(br.readLine()));
            total += Math.abs(last-cur);
            last=cur;
        }
        System.out.println(total);
    }
}
