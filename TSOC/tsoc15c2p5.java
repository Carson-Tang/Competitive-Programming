import java.io.*;
import java.util.*;

public class Main {
    static int s;
    static class bebilith implements Comparable<bebilith>{
        int ind, speed, dist, claw;
        bebilith(int ind, int speed, int dist, int claw){
            this.ind=ind;
            this.speed=speed;
            this.dist=dist;
            this.claw=claw;
        }
        public int compareTo(bebilith a){
            if(a.speed==this.speed && this.speed>=s){
                if(a.claw>this.claw) return 1;
                else return -1;
            } else if (a.speed==this.speed && this.speed<s){
                if(a.dist>this.dist) return 1;
                else return -1;
            } else if (a.speed!=this.speed){
                if(a.speed>this.speed) return 1;
                else return -1;
            } else if(a.ind<this.ind) return 1;
            else return -1;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        s = Integer.parseInt(br.readLine());
        ArrayList<bebilith> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= n; i++){
            String [] tok = br.readLine().split(" ");
            int b = Integer.parseInt(tok[0]), d = Integer.parseInt(tok[1]), c = Integer.parseInt(tok[2]);
            list.add(new bebilith(i,b,d,c));
        }
        int q = Integer.parseInt(br.readLine());
        Collections.sort(list);
        for(int i = 0; i < q; i++){
            System.out.println(list.get(Integer.parseInt(br.readLine())-1).ind);
        }
    }
}
