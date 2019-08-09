import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        int [][] board = new int[n][n];
        int x,y;
        for(int i =0; i < m; i++){
            String [] t = br.readLine().split(" ");
            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while(x<=n && y<=n && x>0 && y>0){
                board[x-1][y-1]=1;
                x++;
                y++;
            }
            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while(x<=n && y<=n && x>0 && y>0){
                board[x-1][y-1]=1;
                x++;
                y--;
            }
            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while(x<=n && y<=n && x>0 && y>0){
                board[x-1][y-1]=1;
                x--;
                y++;
            }
            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while(x<=n && y<=n && x>0 && y>0){
                board[x-1][y-1]=1;
                x--;
                y--;
            }
            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while(x<=n && y<=n && x>0 && y>0){
                board[x-1][y-1]=1;
                x--;
            }
            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while(x<=n && y<=n && x>0 && y>0){
                board[x-1][y-1]=1;
                y--;
            }
            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while(x<=n && y<=n && x>0 && y>0){
                board[x-1][y-1]=1;
                x++;
            }
            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while(x<=n && y<=n && x>0 && y>0){
                board[x-1][y-1]=1;
                y++;
            }
        }
        int c=0;
        for(int i =0; i < n; i++){
            for(int k =0; k < n; k++){
                if(board[i][k]==0){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
