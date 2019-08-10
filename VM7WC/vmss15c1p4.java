import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int t = Integer.parseInt(tok[0]);
        int n = Integer.parseInt(tok[1]);
        int m = Integer.parseInt(tok[2]);
        int g = Integer.parseInt(tok[3]);
        ArrayList<Integer>grocerystores = new ArrayList<>();
        for(int i = 0; i < g; i++){
            grocerystores.add(Integer.parseInt(br.readLine()));
        }
        int [][] adj = new int[n+1][n+1];
        for(int i = 0; i < n+1; i++){
            for(int k = 0; k < n+1; k++){
                adj[i][k]=99999;
            }
        }
        for(int i = 0; i < m; i++){
            String [] to = br.readLine().split(" ");
            int a = Integer.parseInt(to[0]);
            int b = Integer.parseInt(to[1]);
            int l = Integer.parseInt(to[2]);
            if(adj[a][b]>l){
                adj[a][b]=l;
            }
        }
        boolean [] v = new boolean[n+1];
        int [] dis = new int[n+1];
        for(int i = 0; i < n+1; i++){
            dis[i]=99999;
        }
        dis[0]=0;
        LinkedList<Integer>q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int e = q.remove();
            v[e]=true;
            for(int i = 0; i < n+1; i++){
                if(adj[e][i]!=99999 && !v[i]){
                    if(dis[e]+adj[e][i]<dis[i]){
                        dis[i]=dis[e]+adj[e][i];
                    }
                }
            }
            int min = 99999;
            int f = -1;
            for(int k = 1; k < n+1; k++){
                if(dis[k]<min && !v[k]){
                    min=dis[k];
                    f=k;
                }
            }
            if(f!=-1){
                q.add(f);
            }
        }
        int count = 0;
        for(int i = 0; i < grocerystores.size(); i++){
            if(dis[grocerystores.get(i)]<=t){
                count++;
            }
        }
        System.out.println(count);
    }
}
