import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int o = Integer.parseInt(br.readLine());
        for(int i = 0; i < o; i++){
            int n = Integer.parseInt(br.readLine());
            int [][] grid = new int[n][n];
            for(int k = 0; k < n; k++){
                for(int j = 0; j < n; j++){
                    grid[k][j]=Integer.parseInt(br.readLine());
                }
            }
            bfs(grid,n);
        }
    }
    public static void bfs(int [][]grid,int n){
        boolean[][]vis = new boolean[n][n];
        int [][] dis = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                dis[i][k]=999;
            }
        }
        dis[0][0]=0;
        LinkedList<Integer>q = new LinkedList<>();
        int [][]dir = {{1,0},{-1,0},{0,1},{0,-1}};
        q.add(0);
        q.add(0);
        while(!q.isEmpty()){
            int xr = q.poll();
            int yr = q.poll();
            vis[xr][yr]=true;
            for(int i = 0;  i < 4; i++){
                int xc = xr + dir[i][0];
                int yc = yr + dir[i][1];
                if(xc>-1 && yc>-1 && xc<n && yc<n){
                    if(!vis[xc][yc] && Math.abs(grid[xr][yr]-grid[xc][yc])<3){
                        q.add(xc);
                        q.add(yc);
                        vis[xc][yc]=true;
                        if(grid[xc][yc]<=grid[0][0] && grid[xr][yr]<=grid[0][0]){
                            dis[xc][yc]=dis[xr][yr];
                        } else {
                            dis[xc][yc]=dis[xr][yr]+1;
                        }

                    }
                }
            }
        }
        if(dis[n-1][n-1]==999){
            System.out.println("CANNOT MAKE THE TRIP");
        } else {
            System.out.println(dis[n-1][n-1]);
        }
    }
}
