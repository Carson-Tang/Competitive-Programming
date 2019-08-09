import java.io.*;
import java.util.*;

public class Main {
    static class edge implements Comparable<edge>{
        int dest,time,hull;
        edge(int dest, int time, int hull){
            this.dest=dest;
            this.time=time;
            this.hull=hull;
        }
        public int compareTo(edge a){
            if(this.time>a.time) return 1;
            if(this.time<a.time) return -1;
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int k = Integer.parseInt(tok[0]), n = Integer.parseInt(tok[1]), m = Integer.parseInt(tok[2]);
        ArrayList<edge> [] x = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++) x[i]=new ArrayList<>();
        for(int i = 0; i < m; i++){
            String [] tok2 = br.readLine().split(" ");
            int a = Integer.parseInt(tok2[0]), b = Integer.parseInt(tok2[1]), t = Integer.parseInt(tok2[2]), h = Integer.parseInt(tok2[3]);
            x[a].add(new edge(b,t,h));
            x[b].add(new edge(a,t,h));
        }
        String [] tok2 = br.readLine().split(" ");
        int start = Integer.parseInt(tok2[0]), end = Integer.parseInt(tok2[1]);
        int [][] dis = new int[n+1][k+1];
        for(int [] a : dis) Arrays.fill(a,9999999);
        PriorityQueue<edge> q = new PriorityQueue<>();
        q.add(new edge(start,0,k));
        while(!q.isEmpty()){
            edge a = q.poll();
            int e = a.dest;
            for(edge b : x[e]){
                int time = a.time + b.time;
                int hull = a.hull - b.hull;
                if(hull<1) continue;
                int f = b.dest;
                if(dis[f][hull]>time){
                    dis[f][hull]=time;
                    q.add(new edge(f,time,hull));
                }
            }
            if(e==end) q.clear();
        }
        int min = 9999999;
        for(int i = 0; i < k+1; i++){
            if(dis[end][i]<min){
                min=dis[end][i];
            }
        }
        if(min==9999999) System.out.println(-1);
        else System.out.println(min);
    }
}
