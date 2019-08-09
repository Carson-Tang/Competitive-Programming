import java.io.*;
import java.util.*;

public class Main {
    static class edge implements Comparable<edge>{
        int dest, w;
        edge(int dest, int w){
            this.dest=dest;
            this.w=w;
        }
        public int compareTo(edge a){
            if(this.w>a.w) return 1;
            if(this.w<a.w) return -1;
            return 0;
        }
    }
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] tok = br.readLine().split(" ");
        int [] items = new int[n+1];
        for(int i = 0; i < n; i++) items[i+1] = Integer.parseInt(tok[i]);
        ArrayList<edge>[]x = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++) x[i]=new ArrayList<>();
        int m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++){
            String [] tok2 = br.readLine().split(" ");
            int a = Integer.parseInt(tok2[0]), b = Integer.parseInt(tok2[1]), d = Integer.parseInt(tok2[2]);
            x[a].add(new edge(b,d));
            x[b].add(new edge(a,d));
        }
        int [] dis = new int[n+1];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[1]=0;
        int [] maxitems = new int[n+1];
        maxitems[1] = items[1];
        PriorityQueue<edge> q = new PriorityQueue<>();
        q.add(new edge(1,0));
        while(!q.isEmpty()){
            edge a = q.poll();
            int ind = a.dest;
            for(int i = 0; i < x[ind].size(); i++){
                if(dis[x[ind].get(i).dest]> x[ind].get(i).w + dis[ind]){
                    dis[x[ind].get(i).dest]= x[ind].get(i).w + dis[ind];
                    maxitems[x[ind].get(i).dest] = items[x[ind].get(i).dest] + maxitems[ind];
                    q.add(new edge(x[ind].get(i).dest, x[ind].get(i).w));
                } else if (dis[x[ind].get(i).dest]== x[ind].get(i).w + dis[ind]){
                    q.add(new edge(x[ind].get(i).dest, x[ind].get(i).w));
                    if(maxitems[x[ind].get(i).dest] < items[x[ind].get(i).dest] + maxitems[ind]) {
                        maxitems[x[ind].get(i).dest] = items[x[ind].get(i).dest] + maxitems[ind];
                    }
                }
            }
        }
        if(dis[n]==Integer.MAX_VALUE){
            System.out.println("impossible");
        } else {
            System.out.println(dis[n] + " " + maxitems[n]);
        }
    }
}
