import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int r = Integer.parseInt(tok[0]), c = Integer.parseInt(tok[1]);
        int [][] grid =  new int[r][c];
        for(int i = 0; i < r; i++){
            String s = br.readLine();
            for(int k = 0; k < c; k++){
                if(s.charAt(k)=='X'){
                    grid[i][k]=-1;
                } else if (s.charAt(k)=='.'){
                    grid[i][k]=0;
                }
            }
        }
        int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        int cell = 1;
        for(int i = 0; i < r; i++){
            for(int k = 0; k < c; k++){
                if(grid[i][k]==0){
                    bfs(cell,dir,grid,i,k,r,c);
                    cell++;
                }
            }
        }
        int maxcellconnect=1;
        int xcbreak=0,ycbreak=0;
        ArrayList<Integer>best = new ArrayList<>();
        for(int i = 0; i < r; i++){
            for(int k = 0; k < c; k++){
                if(grid[i][k]==-1) {
                    HashSet<Integer>x = new HashSet<>();
                    for (int j = 0; j < 4; j++) {
                        int xc = i + dir[j][0];
                        int yc = k + dir[j][1];
                        if(xc>-1&&yc>-1&&xc<r&&yc<c){
                            if(grid[xc][yc]>0) {
                                x.add(grid[xc][yc]);
                            }
                        }
                    }
                    if(x.size()>maxcellconnect){
                        xcbreak=i;
                        ycbreak=k;
                        maxcellconnect = x.size();
                        best.clear();
                        best.addAll(x);
                    }
                }
            }
        }
        if(maxcellconnect==1) System.out.println(-1);
        else {
            System.out.println(maxcellconnect);
            System.out.println(ycbreak + " " + xcbreak);
            Collections.sort(best);
            for (int a : best) {
                System.out.print(a + " ");
            }
        }
    }
    public static void bfs(int cell,int [][] dir,int [][] grid, int startx, int starty, int r, int c){
        LinkedList<Integer>q = new LinkedList<>();
        q.add(startx);
        q.add(starty);
        boolean [][] vis = new boolean[r][c];
        while(!q.isEmpty()){
            int xr = q.poll();
            int yr = q.poll();
            vis[xr][yr]=true;
            grid[xr][yr]=cell;
            for(int i = 0; i < 4; i++){
                int xc = xr + dir[i][0];
                int yc = yr + dir[i][1];
                if(xc>-1&&yc>-1&&xc<r&&yc<c){
                    if(!vis[xc][yc]&&grid[xc][yc]==0){
                        grid[xc][yc]=cell;
                        vis[xc][yc]=true;
                        q.add(xc);
                        q.add(yc);
                    }
                }
            }
        }
    }
}
