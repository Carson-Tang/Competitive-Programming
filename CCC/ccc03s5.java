import java.io.*;
import java.util.*;

public class Main {
    static class Edge implements Comparable<Edge>{
        int src, dest, w;
        Edge(int a, int b, int c){
            src = a;
            dest = b;
            w = c;
        }
        public int compareTo(Edge d){
            return this.w > d.w ? 1 : this.w < d.w ? -1 : 0;
        }
    }
    static class dir{
        int dest, w;
        dir(int a, int b){
            dest = a;
            w = b;
        }
    }
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] t = br.readLine().split(" ");
        int c = Integer.parseInt(t[0]), r = Integer.parseInt(t[1]), d = Integer.parseInt(t[2]);
        int [] parent = new int[c+1];
        for(int i = 0; i < c+1; i++) parent[i]=i;
        ArrayList<Edge> e = new ArrayList<>();
        for(int i = 0; i < r; i++){
            String [] tok = br.readLine().split(" ");
            int x = Integer.parseInt(tok[0]), y = Integer.parseInt(tok[1]), w = Integer.parseInt(tok[2]);
            if(x>y){
                e.add(new Edge(y,x,w));
            } else {
                e.add(new Edge(x,y,w));
            }
        }
        Collections.sort(e);
        Collections.reverse(e);
        ArrayList<dir>[]x = new ArrayList[c+1];
        for(int i = 0; i < c+1; i++) x[i] = new ArrayList<>();
        for(Edge a : e){
            if(Find(a.src,parent)!=Find(a.dest,parent)){
                x[a.src].add(new dir(a.dest,a.w));
                x[a.dest].add(new dir(a.src,a.w));
                Union(a.src,a.dest,parent);
            }
        }
        boolean [] des = new boolean[c+1];
        boolean [] vis = new boolean[c+1];
        for(int i = 0; i < d; i++) des[Integer.parseInt(br.readLine())] = true;
        int min = Integer.MAX_VALUE;
        LinkedList<Integer>q = new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()){
            int v = q.poll();
            vis[v]=true;
            for(int i = 0; i < x[v].size(); i++){
                int f = x[v].get(i).dest;
                if(!vis[f]) {
                    q.add(f);
                    if (des[f]) {
                        if (x[v].get(i).w < min) {
                            min = x[v].get(i).w;
                        }
                    }
                }
            }
        }
        System.out.println(min);
    }
    public static int Find(int v, int [] parent){
        if(parent[v]!=v){
            parent[v]=Find(parent[v],parent);
        }
        return parent[v];
    }
    public static void Union(int a, int b, int [] parent){
        parent[Find(a,parent)] = Find(b,parent);
    }
}
