import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine()), y = Integer.parseInt(br.readLine());
        int [][] grid = new int[11][11];
        int xr = 5, yr = 5;
        int a=1,b=2;
        int [][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        int c = x;
        if(c==y){
            System.out.println(c);
            return;
        } else {
            grid[xr][yr]=c;
            c++;
            while(c!=y+1){
                for(int i = 0; i<4; i++){
                    if(i<2){
                        for(int k = 0; k < a; k++) {
                            xr += dir[i][0];
                            yr += dir[i][1];
                            grid[xr][yr]=c;
                            c++;
                            if(c==y+1){
                                break;
                            }
                        }
                        if(i==1){
                            a+=2;
                        }
                    } else {
                        for(int k = 0; k < b; k++) {
                            xr += dir[i][0];
                            yr += dir[i][1];
                            grid[xr][yr]=c;
                            c++;
                            if(c==y+1){
                                break;
                            }
                        }
                        if(i==3){
                            b+=2;
                        }
                    }
                    if(c==y+1){
                        break;
                    }
                }
            }
        }
        int xmin=12,xmax=0,ymin=12,ymax=0;
        for(int i = 0; i < 11; i++){
            for(int k = 0; k < 11; k++){
                if(grid[i][k]!=0){
                    if(i<xmin){
                        xmin=i;
                    }
                    if(i>xmax){
                        xmax=i;
                    }
                    if(k<ymin){
                        ymin=k;
                    }
                    if(k>ymax){
                        ymax=k;
                    }
                }
            }
        }
        for(int i = xmin; i <= xmax; i++){
            for(int k = ymin; k <= ymax; k++){
                if(grid[i][k]==0){
                    System.out.print("   ");
                } else {
                    if (Integer.toString(grid[i][k]).length() == 1) {
                        System.out.print(" " + grid[i][k] + " ");
                    } else {
                        System.out.print(grid[i][k] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}
