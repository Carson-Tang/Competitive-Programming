import java.io.*;
import java.util.*;

public class Main {
    static class sheep {
        double x,y;
        sheep(double x, double y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        boolean [] eaten = new boolean[n];
        sheep [] shp = new sheep[n];
        for(int i = 0; i < n; i++) shp[i]=new sheep(Double.parseDouble(br.readLine()),Double.parseDouble(br.readLine()));
        for(double i = 0; i <= 1000; i+=0.01){
            double [] dis = new double[n];
            for(int k = 0; k < n; k++){
                dis[k] = (shp[k].x-i) * (shp[k].x-i) + shp[k].y * shp[k].y;
            }
            double min = Double.MAX_VALUE;
            for(int k = 0; k < n; k++) min = Math.min(min,dis[k]);
            for(int k = 0; k < n; k++) if (dis[k]==min) eaten[k]=true;
        }
        for(int i = 0; i < n; i++) if (eaten[i]) System.out.printf("The sheep at (%.2f, %.2f) might be eaten.\n", shp[i].x,shp[i].y);
    }
}
