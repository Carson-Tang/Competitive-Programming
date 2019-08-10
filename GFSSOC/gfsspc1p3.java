import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int c = 0;
        for(int i = 1; i < n; i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                c++;
            }
        }
        if(c>2) {
            System.out.println("FIX YOUR BEADS!");
        } else {
            System.out.println("Organized");
        }
    }
}
