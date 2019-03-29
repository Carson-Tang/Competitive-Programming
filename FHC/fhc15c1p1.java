import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int [] prim = new int[10000001];
        HashSet<Integer> x = new HashSet<>();
        for(int k = 2; k < 10000001; k++) {
            int temp = k;
            for (int i = 2; i <= temp/i; i++) {
                while (temp % i == 0) {
                    x.add(i);
                    temp /= i;
                }
            }
            if(temp>1) x.add(temp);
            prim[k]=x.size();
            x.clear();
        }
        for(int j = 1; j <= t; j++) {
            String [] tok = br.readLine().split(" ");
            int a = Integer.parseInt(tok[0]), b = Integer.parseInt(tok[1]), k = Integer.parseInt(tok[2]);
            int tot = 0;
            for(int i = a; i <= b; i++){
                if(prim[i]==k){
                    tot++;
                }
            }
            System.out.println("Case #"+j+": "+tot);
        }
    }
}
