import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String [] tok = br.readLine().split(" ");
        int startx = Integer.parseInt(tok[0]), starty = Integer.parseInt(tok[1]);
        String [] tokk = br.readLine().split(" ");
        int endx = Integer.parseInt(tokk[0]), endy = Integer.parseInt(tokk[1]);
        bfs(startx,starty,endx,endy,t);
    }
    public static void bfs(int startx, int starty, int endx, int endy, int t){
        LinkedList<Integer>q = new LinkedList<>();
        q.add(startx);
        q.add(starty);
        int [][] dir = {{1,1},{-1,-1},{1,-1},{-1,1}};
        boolean [][] vis = new boolean[17][17];
        int [][] dis = new int[17][17];
        while(!q.isEmpty()){
            int xr = q.poll();
            int yr = q.poll();
            vis[xr][yr]=true;
            for(int i = 0; i < 4; i++){
                int xc = xr + dir[i][0];
                int yc = yr + dir[i][1];
                if(xc>-1 && yc>-1 && xc<17 && yc<17){
                    if(!vis[xc][yc]){
                        vis[xc][yc]=true;
                        q.add(xc);
                        q.add(yc);
                        dis[xc][yc] = dis[xr][yr]+1;
                    }
                }
            }
        }
        if(!vis[endx][endy]) System.out.println("Cannot physically get there.");
        else if (dis[endx][endy]>t) System.out.println("Cannot get there on time.");
        else System.out.println("It takes "+dis[endx][endy]+" minute(s) to get to ("+endx+", "+endy+").");
    }
}
