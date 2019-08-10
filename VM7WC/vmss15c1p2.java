import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int r = Integer.parseInt(tok[0]), c = Integer.parseInt(tok[1]);
        int t = 0;
        char [][] grid = new char[r][c];
        boolean [][] vis = new boolean[r][c];
        for(int i = 0; i < r; i++){
            String s = br.readLine();
            for(int k = 0; k < c; k++){
                grid[i][k]=s.charAt(k);
            }
        }
        for(int i = 0; i < r; i++){
            for(int k = 0; k < c; k++){
                if(!vis[i][k] && grid[i][k]!='X'){
                    bfs(grid,vis,r,c,i,k);
                    t++;
                }
            }
        }
        System.out.println(t);
    }
    public static void bfs (char [][] grid, boolean [][] vis, int r, int c, int i , int k){
        LinkedList<Integer>q = new LinkedList<>();
        q.add(i); q.add(k);
        int [][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty()){
            int xr = q.poll();
            int yr = q.poll();
            vis[xr][yr]=true;
            for(int j = 0;j < 4;j++){
                int xc = xr + dir[j][0];
                int yc = yr + dir[j][1];
                if(xc>-1 && yc>-1 && xc<r && yc<c){
                    if(grid[xc][yc]!='X' && !vis[xc][yc]) {
                        q.add(xc);
                        q.add(yc);
                        vis[xc][yc]=true;
                    }
                }
            }
        }
    }
}
