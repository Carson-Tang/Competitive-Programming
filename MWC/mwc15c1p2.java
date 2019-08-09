import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        Character [][] x = new Character[n][m];
        for(int i = 0; i < n; i++){
            String [] t = br.readLine().split(" ");
            for(int k = 0; k < m; k++){
                x[i][k] = t[k].charAt(0);
            }
        }
        int maxx=0;
        int minx= Integer.MAX_VALUE;
        int maxy=0;
        int miny= Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            for(int k = 0; k < m; k++){
                if(x[i][k]=='*'){
                    if(i>maxx){
                        maxx=i;
                    }
                    if(i<minx){
                        minx=i;
                    }
                    if(k>maxy){
                        maxy=k;
                    }
                    if(k<miny){
                        miny = k;
                    }
                }
            }
        }
        for(int i = minx; i <= maxx; i++){
            for(int k = miny; k <= maxy; k++){
                System.out.print(x[i][k] +" ");
            }
            System.out.println();
        }
    }
}
