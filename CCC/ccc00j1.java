import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = sc.readLine().split(" ");
        int startday = Integer.parseInt(tok[0]);
        int days = Integer.parseInt(tok[1]);
        Integer [] x = new Integer[days];
        for(int i = 0; i < days; i++){
            x[i] = i+1;
        }
        int dayofweek = 0;
        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
        if(startday>1){
            System.out.print("   ");
        }
        for (int i = 0; i < startday - 2; i++) {
            System.out.print("    ");
            dayofweek++;
            if (dayofweek == 7) {
                dayofweek = 0;
                System.out.println();
            }
        }
        if(startday>1) {
            dayofweek++;
        }
        for(int i = 0; i < days; i++){
            if(dayofweek==0){
                System.out.printf("%1$3s",x[i]);
            } else {
                System.out.printf("%1$4s", x[i]);
            }
            dayofweek++;
            if(dayofweek==7){
                dayofweek=0;
                System.out.println();
            }
        }
        if(days!=28) {
            System.out.println();
        }
    }
}
