import java.io.*;
import java.util.*;

public class Main {
    static class edge implements Comparable<edge>{
        int dest, dis, suntime;
        edge(int dest, int dis, int suntime){
            this.dest=dest;
            this.dis=dis;
            this.suntime=suntime;
        }
        public int compareTo(edge a){
            if(this.dis>a.dis) return 1;
            if(this.dis<a.dis) return -1;
            return 0;
        }
    }
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine());
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]), e = Integer.parseInt(tok[1]);
        ArrayList<edge>[]x = new ArrayList[n];
        for(int i = 0; i < n; i++) x[i] = new ArrayList<>();
        for(int i = 0; i < e; i++){
            String [] tok2 = br.readLine().split(" ");
            int a = Integer.parseInt(tok2[0]), b = Integer.parseInt(tok2[1]), d = Integer.parseInt(tok2[2]), u = Integer.parseInt(tok2[3]);
            if(u==1){
                x[a].add(new edge(b, d, d));
                x[b].add(new edge(a, d, d));
            } else {
                x[a].add(new edge(b, d, u));
                x[b].add(new edge(a, d, u));
            }
        }
        PriorityQueue<edge>q = new PriorityQueue<>();
        int [][] dis = new int[n][s+1];
        for(int [] a : dis) Arrays.fill(a,999999);
        q.add(new edge(0,0,s));
        while(!q.isEmpty()){
            edge a = q.poll();
            int cur = a.dest;
            if(cur==n-1){
               q.clear();
               continue;
            }
            for(edge b : x[cur]){
                int len = a.dis + b.dis;
                int light = a.suntime - b.suntime;
                if(light<0) continue;
                int f = b.dest;
                if(dis[f][light]>len){
                    dis[f][light]=len;
                    q.add(new edge(f,len,light));
                }
            }
        }
        int min = 999999;
        for(int i = 0; i < s+1; i++){
            min = Math.min(dis[n-1][i],min);
        }
        if(min==999999) System.out.println(-1);
        else System.out.println(min);
    }
}
