import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String s;
        int t;
        for(int i = 0; i < n; i++) {
            t = Integer.parseInt(sc.readLine());
            s = Integer.toBinaryString(t);
            for(int k = 0; k < s.length(); k++){
                if(s.charAt(k)=='0'){
                    System.out.print("meme ");
                } else {
                    System.out.print("dank ");
                }
            }
            System.out.println("");
        }
    }
}
