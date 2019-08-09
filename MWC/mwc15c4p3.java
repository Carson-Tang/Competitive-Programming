import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] t = br.readLine().split(" ");
        int n = Integer.parseInt(t[0]);
        int q = Integer.parseInt(t[1]);
        Map<String, Integer> salt = new HashMap<>();
        Map<String, Integer> x = new HashMap<>();
        Map<String, Integer> y = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String [] tok = br.readLine().split(" ");
            salt.put(tok[0] +","+ tok[1], 1);
            if(x.get(tok[0])==null){
                x.put(tok[0],1);
            } else {
                x.put(tok[0], x.get(tok[0])+1);
            }
            if(y.get(tok[1])==null){
                y.put(tok[1],1);
            } else {
                y.put(tok[1], y.get(tok[1])+1);
            }
        }
        for(int i = 0 ; i < q; i++){
            String [] to = br.readLine().split(" ");
            if("1".equals(to[0])){
                if(salt.get(to[1]+","+to[2])==null){
                    System.out.println("bland");
                } else {
                    System.out.println("salty");
                }
            } else {
                if("X".equals(to[1])){
                    if(x.get(to[2])==null){
                        System.out.println(0);
                    } else {
                        System.out.println(x.get(to[2]));
                    }
                } else {
                    if(y.get(to[2])==null){
                        System.out.println(0);
                    } else {
                        System.out.println(y.get(to[2]));
                    }
                }
            }
        }
    }
}
