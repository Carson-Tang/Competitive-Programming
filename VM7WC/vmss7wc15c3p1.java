import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double dx=0,dy=0;
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            int r = Integer.parseInt(tok[0]), d = Integer.parseInt(tok[1]);
            d%=360;
            if(d==0){
                dx+=r;
            } else if (d==90){
                dy+=r;
            } else if (d==180){
                dx-=r;
            } else if (d==270){
                dy-=r;
            } else if (d>0&&d<90){
                dx+=Math.cos(Math.toRadians(d))*r;
                dy+=Math.sin(Math.toRadians(d))*r;
            } else if (d>90&&d<180){
                d = 180-d;
                dx-=Math.cos(Math.toRadians(d))*r;
                dy+=Math.sin(Math.toRadians(d))*r;
            } else if (d>180&&d<270){
                d = d-180;
                dx-=Math.cos(Math.toRadians(d))*r;
                dy-=Math.sin(Math.toRadians(d))*r;
            } else {
                d = 360-d;
                dx+=Math.cos(Math.toRadians(d))*r;
                dy-=Math.sin(Math.toRadians(d))*r;
            }
        }
        int dtr = (int)Math.round(Math.sqrt(dx*dx + dy*dy));
        int dtd = (int)Math.round(Math.toDegrees(Math.atan2(dy,dx)));
        if(dtd<0) dtd+=360;
        System.out.println(dtr + " " + dtd);
    }
}
