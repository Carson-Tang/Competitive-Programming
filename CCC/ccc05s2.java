import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int maxx = Integer.parseInt(tok[0]);
        int maxy = Integer.parseInt(tok[1]);
        int x=0,y=0, shiftx, shifty;
        while(true){
            String [] in = br.readLine().split(" ");
            shiftx = Integer.parseInt(in[0]);
            shifty = Integer.parseInt(in[1]);
            if(shiftx ==0&& shifty==0){
                break;
            }
            x += shiftx;
            y += shifty;
            if(x>maxx){
                x = maxx;
            } else if (x<0){
                x=0;
            }
            if(y>maxy){
                y = maxy;
            } else if (y<0){
                y=0;
            }

            System.out.println(x + " " + y);
        }
    }
}
