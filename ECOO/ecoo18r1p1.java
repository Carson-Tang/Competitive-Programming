import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int k = 0; k < 10; k++){
            String [] tok = br.readLine().split(" ");
            int t = Integer.parseInt(tok[0]), n = Integer.parseInt(tok[1]);
            int day=0, box=0, dayspast=0;
            for(int i = 0; i < n; i++){
                String s = br.readLine();
                if(s.equals("B")){
                    box++;
                }
                day++;
                if(box>0){
                    dayspast++;
                    if(dayspast==t){
                        dayspast=0;
                        box--;
                    }
                }
            }
            while(box>0){
                day++;
                dayspast++;
                if(dayspast==t){
                    dayspast=0;
                    box--;
                }
            }
            System.out.println(day-n);
        }
    }
}
