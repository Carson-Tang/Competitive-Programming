import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String t = sc.readLine();
        int n = Integer.parseInt(sc.readLine());

        for(int i = 0; i < n; i++) {
            boolean a = false;
            String s = sc.readLine();
            for(int k = 0; k < t.length(); k++){
                if(!a) {
                    if (!s.contains(Character.toString(t.charAt(k)))) {
                        System.out.println("no");
                        a = true;
                    }
                }
            }
            if(!a){
                System.out.println("yes");
            }
        }
    }
}
