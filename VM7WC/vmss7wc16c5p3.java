import java.io.*;
import java.util.*;

public class Main {
    public static boolean a = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer>[]x = new ArrayList[n+1];
        for(int i = 0; i <= n; i++){
            x[i]= new ArrayList<>();
        }
        for(int i = 1; i < n; i++){
            String [] tok = br.readLine().split(" ");
            if(!tok[0].equals(tok[1])){
                x[Integer.parseInt(tok[1])].add(Integer.parseInt(tok[0]));
                x[Integer.parseInt(tok[0])].add(Integer.parseInt(tok[1]));
            }
        }
        System.out.println(bfs(bfs(1,x,n),x,n));

    }
    public static int bfs(int start, ArrayList<Integer>[]x, int n){
        int [] dis = new int[n+1];
        boolean [] vis = new boolean[n+1];
        LinkedList<Integer>q=new LinkedList<>();
        q.add(start);
        dis[start]=0;
        int max = 0;
        int nodemax=0;
        while(!q.isEmpty()){
            int e = q.remove();
            vis[e]=true;
            for(int i = 0; i < x[e].size(); i++){
                int v = x[e].get(i);
                if(!vis[v]){
                    vis[v]=true;
                    q.add(v);
                    dis[v]=dis[e]+1;
                    if(dis[v]>max){
                        max=dis[v];
                        nodemax=v;
                    }
                }
            }
        }
        if(a){
            return dis[nodemax];
        }
        a=true;
        return nodemax;
    }
}
