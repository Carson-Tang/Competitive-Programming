import java.io.*;
import java.util.*;

public class Main {
    static class pair implements Comparable<pair>{
        int x,y,v;
        pair(int a, int b, int c){
            x=a;
            y=b;
            v=c;
        }
        public int compareTo(pair a){
            return Integer.compare(this.v,a.v);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] dir = {{1,0},{-1,0},{0,-1},{0,1}};
        for(int tc = 0; tc < 10; tc++){
            String [] tok = br.readLine().split(" ");
            int r = Integer.parseInt(tok[0]), c = Integer.parseInt(tok[1]);
            String [] tok2 = br.readLine().split(" ");
            int startx = Integer.parseInt(tok2[0]), starty = Integer.parseInt(tok2[1]);
            String [] tok3 = br.readLine().split(" ");
            int endx = Integer.parseInt(tok3[0]), endy = Integer.parseInt(tok3[1]);
            int n = Integer.parseInt(br.readLine());
            ArrayList<pair>[][]x = new ArrayList[r][c];
            for(int i = 0; i < r; i++){
                for(int k = 0; k < c; k++){
                    x[i][k]=new ArrayList<>();
                }
            }
            for(int i = 0; i < n; i++){
                String [] tok4 = br.readLine().split(" ");
                int th = Integer.parseInt(tok4[0]), tv = Integer.parseInt(tok4[1]), uh = Integer.parseInt(tok4[2]), uv = Integer.parseInt(tok4[3]);
                x[th][tv].add(new pair(uh,uv,0));
                x[uh][uv].add(new pair(th,tv,0));
            }
            int [][] dis = new int[r][c];
            for(int [] a : dis) Arrays.fill(a,9999999);
            PriorityQueue<pair>q = new PriorityQueue<>();
            q.add(new pair(startx,starty,0));
            dis[startx][starty]=0;
            while(!q.isEmpty()){
                pair curr = q.poll();
                for(pair neigh : x[curr.x][curr.y]){
                    if(dis[neigh.x][neigh.y]>dis[curr.x][curr.y]){
                        dis[neigh.x][neigh.y]=dis[curr.x][curr.y];
                        q.add(new pair(neigh.x,neigh.y,dis[neigh.x][neigh.y]));
                    }
                }
                for(int i = 0; i < 4; i++) {
                    int xr = curr.x + dir[i][0];
                    int yr = curr.y + dir[i][1];
                    if (xr > -1 && yr > -1 && xr < r && yr < c) {
                        if (dis[xr][yr]>dis[curr.x][curr.y]+1) {
                            dis[xr][yr] = dis[curr.x][curr.y] + 1;
                            q.add(new pair(xr, yr,dis[xr][yr]));
                        }
                    }
                }
            }
            System.out.println(dis[endx][endy]);
        }
    }
}
