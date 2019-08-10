import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int startx = Integer.parseInt(tok[0]), starty = Integer.parseInt(tok[1]);
        int n = Integer.parseInt(br.readLine());
        double best = 0;
        for(int i = 0; i < n; i++){
            String [] tok2 = br.readLine().split(" ");
            int x = Integer.parseInt(tok2[0]), y = Integer.parseInt(tok2[1]);
            double cur = Math.abs(startx-x) + Math.abs(starty-y);
            if(cur>best) best=cur;
        }
        System.out.println((int)Math.round(best*best)*2);
    }
}
