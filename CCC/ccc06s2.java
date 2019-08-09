import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> x = new HashMap<>();
        String s = sc.readLine();
        String c = sc.readLine();
        for(int i = 0; i < s.length(); i++){
            x.put(Character.toString(c.charAt(i)),Character.toString(s.charAt(i)));
        }
        String y = sc.readLine();
        String f = "";
        for(int i = 0; i < y.length(); i++){
            if(x.get(Character.toString(y.charAt(i)))!=null){
                f += x.get(Character.toString(y.charAt(i)));
            } else {
                f += ".";
            }
        }
        System.out.println(f);
    }
}
