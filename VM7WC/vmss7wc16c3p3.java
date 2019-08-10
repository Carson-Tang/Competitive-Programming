import java.io.*;
import java.util.*;

public class Main {
    static class node implements Comparable<node>{
        int ind, w;
        node(int a, int b){
            ind=a;w=b;
        }
        public int compareTo(node e){
            if(this.w < e.w)return -1;
            else if(this.w > e.w)return 1;
            else return 0;
        }
    }
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]), m = Integer.parseInt(tok[1]), b = Integer.parseInt(tok[2]), q = Integer.parseInt(tok[3]);
        ArrayList<node>[]edges = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++) edges[i] = new ArrayList<>();
        for(int i = 0; i < m; i++){
            String [] to = br.readLine().split(" ");
            int x = Integer.parseInt(to[0]), y = Integer.parseInt(to[1]), z = Integer.parseInt(to[2]);
            edges[x].add(new node(y,z));
            edges[y].add(new node(x,z));
        }
        int [] dis = new int[n+1];
        dij(dis,edges,b,n);
        for(int i = 0; i < q; i++){
            int a = Integer.parseInt(br.readLine());
            if(dis[a]==Integer.MAX_VALUE) {
                System.out.println(-1);
            } else {
                System.out.println(dis[a]);
            }
        }
    }
    public static void dij(int [] dist, ArrayList<node>[]edges, int b, int n){
        for(int i = 0; i < n+1; i++){
            dist[i]=Integer.MAX_VALUE;
        }
        dist[b]=0;
        PriorityQueue<node> que = new PriorityQueue<>();
        que.add(new node(b,0));
        while(!que.isEmpty()){
            node c = que.poll();
            int e = c.ind;
            for(node d : edges[e]){
                if(dist[e]+d.w<dist[d.ind]){
                    dist[d.ind]=dist[e]+d.w;
                    que.add(new node(d.ind,d.w));
                }
            }
        }
    }
}
