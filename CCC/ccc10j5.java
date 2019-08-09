import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int c = 0, start, end, xc, yc;
        ArrayList<Integer>[] x = new ArrayList[65];
        for (int k = 0; k < 65; k++) {
            x[k] = new ArrayList<>();
        }
        int[][] grid = new int[9][9];
        Map<Integer, String> z = new HashMap<>();
        String [] t = br.readLine().split(" ");
        String [] to = br.readLine().split(" ");
        grid[Integer.parseInt(t[0])][Integer.parseInt(t[1])]=2;
        grid[Integer.parseInt(to[0])][Integer.parseInt(to[1])]=2;
        start = -1;
        end = -1;
        int [][] g =  new int[9][9];
        for (int k = 0; k < 9; k++) {
            for (int j = 0; j < 9; j++) {
                if(k==0 || j==0){
                    grid[k][j]=-1;
                } else {
                    c++;
                    g[k][j]=c;
                    z.put(c, Integer.toString(k) + "," + Integer.toString(j));
                }
                if(grid[k][j]==2 && start==-1){
                    start=c;
                }
                if(grid[k][j]==2 && start!=-1){
                    end = c;
                }
            }
        }
        LinkedList<Integer> q = new LinkedList<>();
        q.add(start);
        boolean [] visited = new boolean[65];
        int e,v;
        String f;
        visited[start]=true;
        while(!q.isEmpty()){
            e = q.remove();
            f = z.get(e);
            String [] tok = f.split(",");
            xc = Integer.parseInt(tok[0]);
            yc = Integer.parseInt(tok[1]);
            if(valid(xc-2,yc+1)){
                if(!visited[g[xc-2][yc+1]]){
                    visited[g[xc-2][yc+1]]=true;
                    q.add(g[xc-2][yc+1]);
                    v=g[xc-2][yc+1];
                    x[e].add(v);
                }
            }
            if(valid(xc-1,yc+2)){
                if(!visited[g[xc-1][yc+2]]){
                    visited[g[xc-1][yc+2]]=true;
                    q.add(g[xc-1][yc+2]);
                    v=g[xc-1][yc+2];
                    x[e].add(v);
                }
            }
            if(valid(xc+1,yc+2)){
                if(!visited[g[xc+1][yc+2]]){
                    visited[g[xc+1][yc+2]]=true;
                    q.add(g[xc+1][yc+2]);
                    v=g[xc+1][yc+2];
                    x[e].add(v);
                }
            }
            if (valid(xc+2,yc+1)){
                if(!visited[g[xc+2][yc+1]]){
                    visited[g[xc+2][yc+1]]=true;
                    q.add(g[xc+2][yc+1]);
                    v=g[xc+2][yc+1];
                    x[e].add(v);
                }
            }
            if(valid(xc+2,yc-1)){
                if(!visited[g[xc+2][yc-1]]){
                    visited[g[xc+2][yc-1]]=true;
                    q.add(g[xc+2][yc-1]);
                    v=g[xc+2][yc-1];
                    x[e].add(v);
                }
            }
            if(valid(xc+1,yc-2)){
                if(!visited[g[xc+1][yc-2]]){
                    visited[g[xc+1][yc-2]]=true;
                    q.add(g[xc+1][yc-2]);
                    v=g[xc+1][yc-2];
                    x[e].add(v);
                }
            }
            if(valid(xc-1,yc-2)){
                if(!visited[g[xc-1][yc-2]]){
                    visited[g[xc-1][yc-2]]=true;
                    q.add(g[xc-1][yc-2]);
                    v=g[xc-1][yc-2];
                    x[e].add(v);
                }
            }
            if(valid(xc-2,yc-1)){
                if(!visited[g[xc-2][yc-1]]){
                    visited[g[xc-2][yc-1]]=true;
                    q.add(g[xc-2][yc-1]);
                    v=g[xc-2][yc-1];
                    x[e].add(v);
                }
            }
        }
        bfs(start, end, x);
    }

    public static void bfs(int start, int end, ArrayList<Integer>[] x) {
        LinkedList<Integer> q = new LinkedList<>();
        int e;
        boolean[] visited = new boolean[65];
        q.add(start);
        visited[start] = true;
        int[] dis = new int[65];
        while (!q.isEmpty()) {
            e = q.remove();
            for (int i = 0; i < x[e].size(); i++) {
                if (!visited[x[e].get(i)]) {
                    visited[x[e].get(i)] = true;
                    q.add(x[e].get(i));
                    dis[x[e].get(i)] = dis[e] + 1;
                }
            }
        }
        System.out.println(dis[end]);
    }

    public static boolean valid(int x, int y) {
        if (x < 1 || y < 1) {
            return false;
        }
        if (x > 8 || y > 8) {
            return false;
        }
        return true;
    }
}
