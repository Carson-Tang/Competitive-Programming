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
            if(a.w>this.w) return -1;
            if(a.w<this.w) return 1;
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        StringTokenizer st;
        int n = Integer.parseInt(tok[0]), m = Integer.parseInt(tok[1]);
        ArrayList<edge>[]x = new ArrayList[n];
        for(int i = 0; i < n; i++) x[i] = new ArrayList<>();
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            x[a].add(new edge(b,t));
            x[b].add(new edge(a,t));
        }
        int [] dis1 = dij(n,0,x);
        int [] dis2 = dij(n,n-1,x);
        int max = 0;
        for(int i = 0; i < n; i++){
            if(dis1[i]+dis2[i]>max){
                max=dis1[i]+dis2[i];
            }
        }
        System.out.println(max);
    }
    public static int [] dij (int n, int start, ArrayList<edge>[]x){
        int [] dis = new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        PriorityQueue<edge> q = new PriorityQueue<>();
        q.add(new edge(start,0));
        dis[start]=0;
        while(!q.isEmpty()){
            edge a = q.poll();
            int e = a.dest;
            for(edge d : x[e]){
                int f = d.dest, g = d.w;
                if(dis[f]>dis[e]+g){
                    dis[f]=dis[e]+g;
                    q.add(new edge(f,g));
                }
            }
        }
        return dis;
    }
}
