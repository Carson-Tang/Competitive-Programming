import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] t= br.readLine().split(" ");
        int n = Integer.parseInt(t[0]);
        int m = Integer.parseInt(t[1]);
        int [][] adjmat = new int[n+1][n+1];
        int x,y,w;
        for(int i = 0; i < n+1; i++){
            for(int k= 0; k < n+1; k++){
                adjmat[i][k]=99999;
            }
        }
        for(int i = 0; i < m; i++){
            String [] tok = br.readLine().split(" ");
            x=Integer.parseInt(tok[0]);
            y=Integer.parseInt(tok[1]);
            w=Integer.parseInt(tok[2]);
            if(adjmat[x][y]>w) {
                adjmat[x][y] = w;
                adjmat[y][x] = w;
            }
        }
        boolean [] visited = new boolean[n+1];
        int [] dis = new int[n+1];
        for(int i = 0; i < n+1; i++){
            dis[i]=99999;
        }
        dis[1]=0;
        visited[0]=true;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(1);
        int e;
        while(!q.isEmpty()){
            e=q.remove();
            visited[e]=true;
            for(int i = 0; i < n+1; i++){
                if(adjmat[e][i]!=99999 && !visited[i]){
                    if(dis[e]+adjmat[e][i]<dis[i]){
                        dis[i]=dis[e]+adjmat[e][i];
                    }
                }
            }
            int min = 99999;
            int f = -1;
            for(int k = 1; k < n+1; k++){
                if(dis[k]<min && !visited[k]){
                    min=dis[k];
                    f=k;
                }
            }
            if(f!=-1){
                q.add(f);
            }
        }
        for(int i = 1; i <= n; i++){
            if(dis[i]!=99999){
                System.out.println(dis[i]);
            } else {
                System.out.println(-1);
            }
        }
    }
}
