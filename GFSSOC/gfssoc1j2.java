import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int x = 0;
        int y = 0;
        int a;
        String s;
        for(int i = 0; i < n; i++){
            s = sc.readLine();
            a = Integer.parseInt(sc.readLine());
            if(s.equals("North")){
                y+=a;
            } else if (s.equals("South")){
                y-=a;
            } else if (s.equals("East")){
                x+=a;
            } else {
                x-=a;
            }
        }
        System.out.println(x + " " + y);
    }
}
