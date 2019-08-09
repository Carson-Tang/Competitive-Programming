import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        int [][] adjmat = new int[n+1][n+1];
        int x,y,w;
        for(int i = 0; i < n+1; i++){
            for(int k= 0; k < n+1; k++){
                adjmat[i][k]=Integer.MAX_VALUE;
            }
        }
        for(int i = 0; i < t; i++){
            String [] tok = br.readLine().split(" ");
            x=Integer.parseInt(tok[0]);
            y=Integer.parseInt(tok[1]);
            w=Integer.parseInt(tok[2]);
            if(adjmat[x][y]>w) {
                adjmat[x][y] = w;
                adjmat[y][x] = w;
            }
        }
        int k = Integer.parseInt(br.readLine());
        int [] costs = new int[n+1];
        for(int i = 0; i < n+1; i++){
            costs[i] = Integer.MAX_VALUE;
        }
        for(int i = 0; i < k; i++) {
            String [] tok = br.readLine().split(" ");
            int z = Integer.parseInt(tok[0]), pz = Integer.parseInt(tok[1]);
            costs[z]=pz;
        }
        boolean [] visited = new boolean[n+1];
        int [] dis = new int[n+1];
        for(int i = 0; i < n+1; i++){
            dis[i]=Integer.MAX_VALUE;
        }
        int d = Integer.parseInt(br.readLine());
        dis[d]=0;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(d);
        int e;
        while(!q.isEmpty()){
            e=q.remove();
            visited[e]=true;
            for(int i = 0; i < n+1; i++){
                if(adjmat[e][i]!=Integer.MAX_VALUE && !visited[i]){
                    if(dis[e]+adjmat[e][i]<dis[i]){
                        dis[i]=dis[e]+adjmat[e][i];
                    }
                }
            }
            int min = Integer.MAX_VALUE;
            int f = -1;
            for(int j = 1; j < n+1; j++){
                if(dis[j]<min && !visited[j]){
                    min=dis[j];
                    f=j;
                }
            }
            if(f!=-1){
                q.add(f);
            }
        }
        int mini = Integer.MAX_VALUE;
        for(int i = 1; i <= n; i++){
            if(dis[i]!=Integer.MAX_VALUE && costs[i]!=Integer.MAX_VALUE){
                if(dis[i]+costs[i]<mini){
                    mini=dis[i]+costs[i];
                }
            }
        }
        System.out.println(mini);
    }
}
