import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        boolean a = false, b = false;
        String s, st;
        for(int i = 0; i < n/2; i++){
            s = sc.readLine();
            st = sc.readLine();
            if(s.equals("lob")){
                b=true;
            }
            if(st.equals("lob")){
                a=true;
            }
            if(!s.equals("lob") && st.equals("lob")){
                System.out.println("BruNO");
                return;
            }
        }
        if(b){
            System.out.println("Possible Bruno");
        }
         else if(!a){
            System.out.println("Not enough information");
        }
    }
}
