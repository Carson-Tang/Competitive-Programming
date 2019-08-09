import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] t = new String[3];
        for(int i = 0; i < n; i++){
            for(int k = 0; k < 3; k++){
                t[k] = br.readLine();
            }
            if(t[0].startsWith(t[1]) || t[0].startsWith(t[2])){
                System.out.println("No");
            } else if (t[1].startsWith(t[0]) || t[1].startsWith(t[2])){
                System.out.println("No");
            } else if (t[2].startsWith(t[0]) || t[2].startsWith(t[1])){
                System.out.println("No");
            } else if(t[0].endsWith(t[1]) || t[0].endsWith(t[2])){
                System.out.println("No");
            } else if (t[1].endsWith(t[0]) || t[1].endsWith(t[2])){
                System.out.println("No");
            } else if (t[2].endsWith(t[0]) || t[2].endsWith(t[1])){
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
