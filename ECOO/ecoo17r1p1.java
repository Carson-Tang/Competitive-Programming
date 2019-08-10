import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double c,n,y1,y2,y3,y4, max,total,stu,maxc=0;
        for(int i = 0; i < 10; i++) {
            max=0;
            total=0;
            stu=0;
            c = Double.parseDouble(br.readLine());
            String [] tok = br.readLine().split(" ");
            n = Double.parseDouble(br.readLine());
            y1 = Double.parseDouble(tok[0]);
            y2 = Double.parseDouble(tok[1]);
            y3 = Double.parseDouble(tok[2]);
            y4 = Double.parseDouble(tok[3]);
            total += Math.floor((y1*n)*12);
            total += Math.floor((y2*n)*10);
            total += Math.floor((y3*n)*7);
            total += Math.floor((y4*n)*5);
            stu += Math.floor(y1*n);
            stu += Math.floor(y2*n);
            stu += Math.floor(y3*n);
            stu += Math.floor(y4*n);
            max = Math.max(max,y1);
            max = Math.max(max,y2);
            max = Math.max(max,y3);
            max = Math.max(max,y4);
            if(max==y1) maxc=12;
            if(max==y2) maxc = 10;
            if(max==y3) maxc=7;
            if(max==y4) maxc=5;
            total += (stu-n)*maxc;
            if(total/2>=c){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
