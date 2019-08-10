import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int a,b;
        int n = Integer.parseInt(tok[0]), m = Integer.parseInt(tok[1]), t = Integer.parseInt(tok[2]);
        ArrayList<Integer>[]x = new ArrayList[n+1];
        int [][] dis = new int[n+1][n+1];
        boolean [] y = new boolean[n+1];
        for(int i = 1; i <= n; i++){
            x[i] = new ArrayList<>();
        }
        for(int i = 0; i < m; i++){
            String [] to = br.readLine().split(" ");
            a = Integer.parseInt(to[0]); b = Integer.parseInt(to[1]);
            y[a]=true;
            x[a].add(b);
        }
        for(int i = 1; i <= n; i++){
            if(y[i]){
                bfs(dis,i,x,n);
            }
        }
        int q = Integer.parseInt(br.readLine());
        for(int i = 0; i < q; i++){
            String [] tokk = br.readLine().split(" ");
            a = Integer.parseInt(tokk[0]); b = Integer.parseInt(tokk[1]);
            if(dis[a][b]==0){
                System.out.println("Not enough hallways!");
            } else {
                System.out.println(dis[a][b]*t);
            }
        }
    }
    public static void bfs(int [][] dis,int i, ArrayList<Integer>[]x, int n){
        LinkedList<Integer>q = new LinkedList<>();
        q.add(i);
        int v;
        boolean [] vis = new boolean[n+1];
        while(!q.isEmpty()){
            int e = q.poll();
            vis[e]=true;
            for(int k =0 ; k < x[e].size(); k++){
                v = x[e].get(k);
                if(!vis[v]){
                    vis[v]=true;
                    q.add(v);
                    dis[i][v] = dis[i][e]+1;
                }
            }
        }
    }
}
