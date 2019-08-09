import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int t = 0,f=-1;
        ArrayList<Integer> x = new ArrayList<>();
        int cw,index=0;
        for(int i = 0; i< n; i++){
            cw = Integer.parseInt(br.readLine());
            t += cw;
            x.add(cw);
            if(i<=3){
                if(t>w && f == -1){
                    f= i;
                }
            } else {
                t -= x.get(index);
                index++;
                if(t>w && f==-1){
                    f = i;
                }
            }
        }
        if(f==-1){
            f=n;
        }
        System.out.println(f);
    }
}
