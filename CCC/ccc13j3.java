import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        s = Integer.toString(Integer.parseInt(s) + 1);
        while (!distinct(s)) {
            s = Integer.toString(Integer.parseInt(s) + 1);
        }
        System.out.println(s);
    }
    public static boolean distinct(String s) {
        String f ="";
        for(int i = 0; i < s.length(); i++) {
            if(f.contains(Character.toString(s.charAt(i)))){
                return false;
            } else {
                f+=s.charAt(i);
            }
        }
        return true;
    }
}
