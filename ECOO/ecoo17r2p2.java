import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 10; i++){
            int c = 0;
            int xstart = -1, ystart=-1;
            int n = Integer.parseInt(br.readLine());
            char [][] grid = new char[n][n];
            for(int k = 0; k < n; k++){
                String s = br.readLine();
                for(int j = 0; j < n; j++){
                    grid[k][j]=s.charAt(j);
                    if(s.charAt(j)=='S'){
                        xstart=k;
                        ystart=j;
                        grid[k][j]='.';
                    }
                }
            }
            bfs(c, grid, xstart, ystart,n);
        }
    }
    public static void bfs(int c, char [][] grid, int xstart, int ystart, int n){
        LinkedList<Integer>q = new LinkedList<>();
        int [][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        q.add(xstart);
        q.add(ystart);
        boolean [][] vis = new boolean[n][n];
        while(!q.isEmpty()){
            int xr = q.poll();
            int yr = q.poll();
            vis[xr][yr]=true;
            for(int i = 0; i < 4; i++){
                int xc = xr + dir[i][0];
                int yc = yr + dir[i][1];
                if(xc>-1 && yc>-1 && xc<n && yc<n){
                    if(!vis[xc][yc] && grid[xc][yc]!='#' && !Character.isDigit(grid[xc][yc])){
                        vis[xc][yc]=true;
                        if(grid[xc][yc]=='T'){
                            grid[xc][yc]='.';
                            c++;
                        } else if (grid[xc][yc]=='K'){
                            grid[xc][yc]='.';
                            q.clear();
                            vis = new boolean[n][n];
                            for(int k = 0; k < n; k++){
                                for(int j = 0; j < n; j++){
                                    if(Character.isDigit(grid[k][j])){
                                        if(grid[k][j]=='1'){
                                            grid[k][j]='.';
                                        } else {
                                            grid[k][j]= Integer.toString(Character.getNumericValue(grid[k][j])-1).charAt(0);
                                        }
                                    }
                                }
                            }
                        }
                        q.add(xc);
                        q.add(yc);
                    }
                }
            }
        }
        System.out.println(c);
    }
}
