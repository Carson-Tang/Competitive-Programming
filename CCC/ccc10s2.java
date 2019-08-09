import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Map<String, String> x = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String [] tok = sc.readLine().split(" ");
            x.put(tok[1],tok[0]);
        }
        String s = sc.readLine();
        String t = "";
        String f="";
        for(int i = 0; i < s.length(); i++){
            t += s.charAt(i);
            if(x.get(t)!=null){
                f+=x.get(t);
                t="";
            }
        }
        System.out.println(f);
    }
}
