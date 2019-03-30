import java.io.*;
import java.util.*;

public class Main {
    static class p implements Comparable<p>{
        int lb, rb;
        p(int lb, int rb){
           this.lb=lb;
           this.rb=rb;
        }
        public int compareTo(p a){
            if(this.lb<a.lb) return -1;
            else if (this.lb>a.lb) return 1;
            else if (this.rb<a.rb) return -1;
            else if (this.rb>a.rb) return 1;
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        ArrayList<p> x = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            int a = Integer.parseInt(tok[0]), b = Integer.parseInt(tok[1]);
            x.add(new p(a,b));
        }
        Collections.sort(x);
        int maxdis = 0;
        int lb = 0;
        for(p c : x){
            maxdis = Math.max(maxdis,c.lb-lb);
            lb = Math.max(lb,c.rb);
        }
        maxdis = Math.max(maxdis,l-lb);
        System.out.println(maxdis);
    }
}
