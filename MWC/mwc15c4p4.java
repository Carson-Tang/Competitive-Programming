import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer>[]x = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++) x[i] = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            int a = Integer.parseInt(tok[0]), b = Integer.parseInt(tok[1]);
            x[a].add(b);
        }
        String [] tok2 = br.readLine().split(" ");
        int xc = Integer.parseInt(tok2[0]), yc = Integer.parseInt(tok2[1]);
        bfs(n,xc,yc,x);
    }
    public static void bfs(int n, int xc, int yc, ArrayList<Integer>[]x){
        LinkedList<Integer>q = new LinkedList<>();
        boolean [] vis = new boolean[n+1];
        q.add(xc);
        while(!q.isEmpty()){
            int e = q.poll();
            vis[e]=true;
            for(int i = 0; i < x[e].size(); i++){
                if(!vis[x[e].get(i)]){
                    vis[x[e].get(i)]=true;
                     q.add(x[e].get(i));
                }
            }
        }
        if(vis[yc]){
            System.out.println("Tangled");
        } else {
            System.out.println("Not Tangled");
        }
    }
}
