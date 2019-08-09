import java.io.*;
import java.util.*;

public class Main {
    static class v implements Comparable<v>{
        int cellinc,cost;
        v(int cellinc, int cost){
            this.cellinc=cellinc;
            this.cost=cost;
        }
        public int compareTo(v a){
            return Integer.compare(this.cost,a.cost);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]), p = Integer.parseInt(tok[1]);
        int planets = 0;
        int maxcells = 0;
        ArrayList<v> x= new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String [] tok2 = br.readLine().split(" ");
            int a = Integer.parseInt(tok2[0]), b = Integer.parseInt(tok2[1]);
            if(i==p){
                planets++;
                maxcells+=a;
            } else if (a-b>-1){
                x.add(new v(a-b,b));
            }
        }
        Collections.sort(x);
        for(v a : x){
            if(a.cost<=maxcells){
                planets++;
                maxcells+=a.cellinc;
            } else break;
        }
        System.out.println(maxcells + "\n" + planets);
    }
}
