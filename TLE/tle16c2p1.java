import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int day=1;
        int currdebt=0;
        int maxdebt=0;

        for(int i = 1; i <= n; i++){
            String [] tok = sc.readLine().split(" ");
            if(tok[0].equals("borrow")){
                currdebt+= Integer.parseInt(tok[1]);
                if(currdebt>maxdebt){
                    maxdebt = currdebt;
                    day = i;
                }
            } else {
                currdebt-= Integer.parseInt(tok[1]);
            }
        }
        if(maxdebt==0){
            System.out.println(0);
        } else {
            System.out.println(day);
        }
    }
}
