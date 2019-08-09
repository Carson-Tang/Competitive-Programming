import java.io.*;
import java.util.*;

public class Main {
    static int dir [][] = {{-1,0},{1,0},{0,-1},{0,1}};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int r = Integer.parseInt(tok[1]), c = Integer.parseInt(tok[0]);
        int [][] grid = new int[r][c];
        for(int i = 0; i < r; i++){
            String [] tok2 = br.readLine().split(" ");
            for(int k = 0; k < c; k++){
                grid[i][k]=Integer.parseInt(tok2[k]);
            }
        }
        int [] valid = new int[3];
        for(int i = 0; i < 10; i++){
            for(int k = i; k < 10; k++){
                for(int j = k; j < 10; j++){
                    valid[0]=i;
                    valid[1]=k;
                    valid[2]=j;
                    for(int f = 0; f < c; f++){
                        bfs(valid,r,c,grid,f);
                    }
                }
            }
        }
        System.out.printf("%d %d %d\n",-1,-1,-1);
    }
    public static void bfs(int [] valid, int r, int c, int [][] grid, int start){
        LinkedList<Integer>q = new LinkedList<>();
        q.add(0);
        q.add(start);
        boolean [][] vis = new boolean[r][c];
        while(!q.isEmpty()){
            int xr = q.poll();
            int yr = q.poll();
            if(xr==r-1){
                System.out.printf("%d %d %d\n",valid[0],valid[1],valid[2]);
                System.exit(0);
            }
            vis[xr][yr]=true;
            for(int i = 0; i < 4; i++){
                int xc = xr + dir[i][0];
                int yc = yr + dir[i][1];
                if(xc>-1 && yc>-1 && xc<r && yc<c){
                    if(!vis[xc][yc]){
                        vis[xc][yc]=true;
                        if(isValid(valid,grid[xc][yc])){
                            q.add(xc);
                            q.add(yc);
                        }
                    }
                }
            }
        }
    }
    public static boolean isValid(int [] valid, int curr){
        if(curr==valid[0]) return true;
        if(curr==valid[1]) return true;
        if(curr==valid[2]) return true;
        return false;
    }
}
