import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int r = Integer.parseInt(tok[0]), c = Integer.parseInt(tok[1]);
        int [][] grid = new int[r+1][c+1];
        int k = Integer.parseInt(br.readLine());
        for(int i = 0; i < k; i++){
            String [] t = br.readLine().split(" ");
            grid[Integer.parseInt(t[0])][Integer.parseInt(t[1])]=1;
        }
        int [][] paths = new int[r+1][c+1];
        paths[1][1]=1;
        grid[1][1]=1;
        for(int i = 1; i < r+1; i++){
            for(int j = 1; j < c+1; j++){
                if(grid[i][j]==0){
                    paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
                }
            }
        }
        System.out.println(paths[r][c]);
    }
}
