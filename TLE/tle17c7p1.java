import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Integer, String> v = new HashMap<>();
        Map<String, Integer> a = new HashMap<>();
        int c=1,x=0,y=0;
        v.put(1,Integer.toString(x) + "," + Integer.toString(y));
        a.put("0,0",1);
        int b;
        String s;
        for(int i = 2; i <= n; i++){
            String [] tok = br.readLine().split(" ");
            b = Integer.parseInt(tok[0]);
            s = v.get(b);
            String [] t = s.split(",");
            x = Integer.parseInt(t[0]) + Integer.parseInt(tok[1]);
            y = Integer.parseInt(t[1]) + Integer.parseInt(tok[2]);
            if(a.get(Integer.toString(x)+","+Integer.toString(y))==null){
                c++;
            }
            v.put(i,Integer.toString(x)+","+Integer.toString(y));
            a.put(Integer.toString(x)+","+Integer.toString(y),1);
        }
        System.out.println(c);
    }
}
