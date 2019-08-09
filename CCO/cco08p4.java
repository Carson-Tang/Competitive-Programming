import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        char [][] grid = new char[n][m];
        int traps=0;
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int k = 0; k < m; k++){
                grid[i][k]=s.charAt(k);
            }
        }
        boolean [][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                if(!vis[i][k]){
                    bfs(i,k,grid,vis,n,m);
                    traps++;
                }
            }
        }
        System.out.println(traps);
    }
    public static void bfs(int x, int y, char [][] grid, boolean [][] vis, int n, int m){
        LinkedList<Integer>q = new LinkedList<>();
        q.add(x);
        q.add(y);
        int xc=-1,yc=-1;
        while(!q.isEmpty()){
            int xr = q.poll();
            int yr = q.poll();
            vis[xr][yr]=true;
            if(grid[xr][yr]=='S'){
                xc = xr+1;
                yc = yr;
            } else if (grid[xr][yr]=='E'){
                xc = xr;
                yc = yr+1;
            } else if (grid[xr][yr]=='N'){
                xc = xr-1;
                yc = yr;
            } else if(grid[xr][yr]=='W'){
                xc = xr;
                yc = yr-1;
            }
            if(xc>-1 && yc>-1 && xc<n && yc<m){
                if(!vis[xc][yc]){
                    vis[xc][yc]=true;
                    q.add(xc);
                    q.add(yc);
                }
            }

            xc = xr+1;
            yc = yr;
            if(xc>-1 && yc>-1 && xc<n && yc<m){
                if(!vis[xc][yc] && grid[xc][yc]=='N'){
                    vis[xc][yc]=true;
                    q.add(xc);
                    q.add(yc);
                }
            }
            xc = xr;
            yc = yr+1;
            if(xc>-1 && yc>-1 && xc<n && yc<m){
                if(!vis[xc][yc]&&grid[xc][yc]=='W'){
                    vis[xc][yc]=true;
                    q.add(xc);
                    q.add(yc);
                }
            }
            xc = xr-1;
            yc = yr;
            if(xc>-1 && yc>-1 && xc<n && yc<m){
                if(!vis[xc][yc]&&grid[xc][yc]=='S'){
                    vis[xc][yc]=true;
                    q.add(xc);
                    q.add(yc);
                }
            }
            xc = xr;
            yc = yr-1;
            if(xc>-1 && yc>-1 && xc<n && yc<m){
                if(!vis[xc][yc]&&grid[xc][yc]=='E'){
                    vis[xc][yc]=true;
                    q.add(xc);
                    q.add(yc);
                }
            }
        }
    }
}
