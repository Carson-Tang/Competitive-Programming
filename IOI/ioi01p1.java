import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []tok = br.readLine().split(" ");
        int s = Integer.parseInt(tok[1]);
        int [][] bit = new int[s+1][s+1];
        while(true){
            String [] tok2 = br.readLine().split(" ");
            if(tok2[0].equals("3")) return;
            else if (tok2[0].equals("1")){
                int x = Integer.parseInt(tok2[1])+1, y = Integer.parseInt(tok2[2])+1, a = Integer.parseInt(tok2[3]);
                update(bit,x,y,a,s);
            } else {
                int x1 = Integer.parseInt(tok2[1])+1, y1 = Integer.parseInt(tok2[2])+1, x2 = Integer.parseInt(tok2[3])+1, y2 = Integer.parseInt(tok2[4])+1;
                System.out.println(sum(bit,x2,y2) + sum(bit,x1-1,y1-1) - sum(bit,x1-1,y2) - sum(bit,x2,y1-1));
            }
        }
    }
    public static long sum(int [][] bit, int x, int y){
        long sum = 0;
        int r;
        for(; x > 0; x -= x&(-x)){
            r = y;
            for(; r > 0; r -= r&(-r)){
                sum+=bit[x][r];
            }
        }
        return sum;
    }
    public static void update(int [][] bit, int x, int y, int a, int s){
        int r;
        for(; x <= s; x += x&(-x)){
            r=y;
            for(; r <= s; r += r&(-r)){
                bit[x][r]+=a;
            }
        }
    }
}
