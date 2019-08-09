import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int r,c;
        String s;
        Map<String, Integer> y = new HashMap<>();
        for(int i = 0; i < t; i++){
            r = Integer.parseInt(br.readLine());
            c = Integer.parseInt(br.readLine());
            char [][] grid = new char[r][c];
            ArrayList<Integer> [] x = new ArrayList[r*c];
            for(int k = 0; k< r*c; k++){
                x[k]=new ArrayList<>();
            }
            for(int k = 0; k < r; k++){
                s = br.readLine();
                for(int j = 0; j < c; j++){
                    grid[k][j]=s.charAt(j);
                    y.put(Integer.toString(k) + "-" + Integer.toString(j),y.size());
                }
            }
            for(int k = 0; k < r; k++){
                for(int j = 0; j < c; j++){
                    if(grid[k][j]=='-'){
                        if(valid(r,c,k,j-1, grid)){
                            x[y.get(Integer.toString(k)+"-"+Integer.toString(j))].add(y.get(Integer.toString(k) + "-" + Integer.toString(j-1)));
                        }
                        if(valid(r,c,k,j+1, grid)){
                            x[y.get(Integer.toString(k)+"-"+Integer.toString(j))].add(y.get(Integer.toString(k) + "-" + Integer.toString(j+1)));
                        }
                    } else if (grid[k][j]=='+'){
                        if(valid(r,c,k,j-1, grid)){
                            x[y.get(Integer.toString(k)+"-"+Integer.toString(j))].add(y.get(Integer.toString(k) + "-" + Integer.toString(j-1)));
                        }
                        if(valid(r,c,k,j+1, grid)){
                            x[y.get(Integer.toString(k)+"-"+Integer.toString(j))].add(y.get(Integer.toString(k) + "-" + Integer.toString(j+1)));
                        }
                        if(valid(r,c,k-1,j, grid)){
                            x[y.get(Integer.toString(k)+"-"+Integer.toString(j))].add(y.get(Integer.toString(k-1) + "-" + Integer.toString(j)));
                        }
                        if(valid(r,c,k+1,j, grid)){
                            x[y.get(Integer.toString(k)+"-"+Integer.toString(j))].add(y.get(Integer.toString(k+1) + "-" + Integer.toString(j)));
                        }
                    } else if (grid[k][j]=='|'){
                        if(valid(r,c,k-1,j, grid)){
                            x[y.get(Integer.toString(k)+"-"+Integer.toString(j))].add(y.get(Integer.toString(k-1) + "-" + Integer.toString(j)));
                        }
                        if(valid(r,c,k+1,j, grid)){
                            x[y.get(Integer.toString(k)+"-"+Integer.toString(j))].add(y.get(Integer.toString(k+1) + "-" + Integer.toString(j)));
                        }
                    }
                }
            }
            bfs(0,r*c-1,x,r*c);
            y.clear();
        }
    }
    public static void bfs(int start, int end, ArrayList<Integer> [] x, int length){
        int e;
        LinkedList<Integer> q = new LinkedList<>();
        q.add(start);
        boolean [] visited = new boolean[length];
        int [] dis = new int[length];
        visited[start]=true;
        while(!q.isEmpty()){
            e=q.remove();
            for(int  i = 0; i < x[e].size(); i++){
                if(!visited[x[e].get(i)]){
                    visited[x[e].get(i)]=true;
                    q.add(x[e].get(i));
                    dis[x[e].get(i)]=dis[e]+1;
                }
            }
        }
        if(length==1){
            System.out.println(1);
        } else if(dis[end]==0){
            System.out.println(-1);
        } else {
            System.out.println(dis[end]+1);
        }
    }
    public static boolean valid(int r, int c, int x, int y, char[][] grid){
        if(x<0 || y<0){
            return false;
        }
        if(x>r-1 || y>c-1){
            return false;
        }
        if(grid[x][y]=='*'){
            return false;
        }
        return true;
    }
}
