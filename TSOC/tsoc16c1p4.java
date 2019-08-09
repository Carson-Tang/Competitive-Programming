import java.io.*;
import java.util.*;

public class Main {
    public static int monkeys=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int r = Integer.parseInt(tok[0]), c = Integer.parseInt(tok[1]);
        char [][] grid = new char[r][c];
        for(int i = 0; i < r; i++){
            String s = br.readLine();
            for(int k = 0; k < c; k++){
                grid[i][k]=s.charAt(k);
            }
        }
        boolean [][] vis = new boolean[r][c];
        for(int i = 0; i < r; i++){
            for(int k = 0; k < c; k++){
                if(grid[i][k]!='#' && !vis[i][k]){
                    bfs(vis,grid,i,k,r,c);
                }
            }
        }
        System.out.println(monkeys);
    }
    public static void bfs (boolean [][] vis, char [][] grid, int startx, int starty, int r, int c){
        LinkedList<Integer>q = new LinkedList<>();
        q.add(startx);
        q.add(starty);
        int [][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        boolean monkey = false;
        while(!q.isEmpty()){
            int xr = q.poll();
            int yr = q.poll();
            if(grid[xr][yr]=='M'){
                monkey=true;
            }
            vis[xr][yr]=true;
            for(int i = 0; i < 4; i++){
                int xc = xr + dir[i][0];
                int yc = yr + dir[i][1];
                if(!vis[xc][yc] && grid[xc][yc]!='#'){
                    q.add(xc);
                    q.add(yc);
                    vis[xc][yc]=true;
                }
            }
        }
        if(monkey){
            monkeys++;
        }
    }
}
