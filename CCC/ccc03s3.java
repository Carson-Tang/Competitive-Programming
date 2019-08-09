import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        char [][] grid = new char[r][c];
        for(int i = 0; i < r; i++){
            String s = br.readLine();
            for(int k = 0; k < c; k++){
                grid[i][k]=s.charAt(k);
            }
        }
        boolean [][] vis = new boolean[r][c];
        ArrayList<Integer>roomsizes = new ArrayList<>();
        for(int i = 0; i < r; i++){
            for(int k = 0; k < c; k++){
                if(!vis[i][k] && grid[i][k]=='.'){
                    RoomSize(grid,vis,roomsizes,r,c,i,k);
                }
            }
        }
        Collections.sort(roomsizes);
        Collections.reverse(roomsizes);
        int rooms = 0;
        for(int i = 0; i < roomsizes.size(); i++){
            if(t-roomsizes.get(i)>-1){
                t-=roomsizes.get(i);
                rooms++;
            } else {
                break;
            }
        }
        if(rooms==1){
            System.out.println(rooms + " room, " + t +" square metre(s) left over");
        } else {
            System.out.println(rooms + " rooms, " + t +" square metre(s) left over");
        }
    }
    public static void RoomSize(char[][]grid,boolean [][] vis, ArrayList<Integer>roomsizes, int r, int c, int startx, int starty){
        LinkedList<Integer>q=new LinkedList<>();
        int count = 0;
        int [][] dir = {{0,1},{0,-1},{1,0},{-1,0}};
        q.add(startx);
        q.add(starty);
        while(!q.isEmpty()){
            int xr = q.poll();
            int yr = q.poll();
            vis[xr][yr]=true;
            count++;
            for(int i = 0; i < 4; i++){
                int xc = xr + dir[i][0];
                int yc = yr + dir[i][1];
                if(xc>-1 && yc>-1 && xc<r && yc<c){
                    if(!vis[xc][yc] && grid[xc][yc]=='.'){
                        vis[xc][yc]=true;
                        q.add(xc);
                        q.add(yc);
                    }
                }
            }
        }
        roomsizes.add(count);
    }
}
