import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int f = Integer.parseInt(tok[0]), r = Integer.parseInt(tok[1]);
        int [][] ps = new int[f][r+1];
        for(int i = 0; i < f; i++){
            String [] tok2 = br.readLine().split(" ");
            ps[i][1] = Integer.parseInt(tok2[0]);
            for(int k = 1; k < r; k++){
                ps[i][k+1] = ps[i][k] + Integer.parseInt(tok2[k]);
            }
        }
        int q = Integer.parseInt(br.readLine());
        int tot=0;
        for(int i = 0; i < q; i++){
            String [] tok2 = br.readLine().split(" ");
            int a = Integer.parseInt(tok2[0]), b = Integer.parseInt(tok2[1]), c = Integer.parseInt(tok2[2]);
            c--;
            a--;
            tot = ps[c][b] - ps[c][a];
            System.out.println(tot);
        }
    }
}
