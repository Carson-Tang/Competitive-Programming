import java.io.*;
import java.util.*;

public class Main {
    static class edge implements Comparable<edge>{
        int dest;
        double w;
        edge(int dest, double w){
            this.dest=dest;
            this.w=w;
        }
        public int compareTo(edge a){
            return Double.compare(this.w,a.w);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]), m = Integer.parseInt(tok[1]);
        Map<String, Integer> fruit = new HashMap<>();
        for(int i = 0; i < n; i++) fruit.put(br.readLine(),i);
        ArrayList<edge>[]x = new ArrayList[n];
        for(int i = 0; i < n; i++) x[i]=new ArrayList<>();
        for(int i = 0; i < m; i++){
            String [] tok2 = br.readLine().split(" ");
            int a = fruit.get(tok2[0]), b = fruit.get(tok2[1]);
            double c = Double.parseDouble(tok2[2]);
            x[a].add(new edge(b,c));
        }
        boolean [] vis = new boolean[n];
        PriorityQueue<edge> q = new PriorityQueue<>();
        int start = fruit.get("APPLES");
        q.add(new edge(start,1));
        double [] cost = new double[n];
        cost[start]=1;
        while(!q.isEmpty()){
            edge a = q.poll();
            int curr = a.dest;
            for(edge neigh : x[curr]){
                if(a.w*neigh.w - cost[neigh.dest] >= 0.0000001){
                    cost[neigh.dest] = a.w*neigh.w;
                    q.add(new edge(neigh.dest,cost[neigh.dest]));
                    if(neigh.dest==start){
                        if(vis[curr]&&cost[neigh.dest]>0.999999){
                            System.out.println("YA");
                            return;
                        } else {
                            vis[curr]=true;
                        }
                    }
                }
            }
        }
        System.out.println("NAW");
    }
}
