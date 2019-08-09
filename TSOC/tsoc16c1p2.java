import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        String st;
        String [] tok = s.split("\\.");
        if(s.contains(".")){
            System.out.println("\"" + tok[0] + "\"" + " - " + tok[1]);
        } else {
            st = sc.readLine();

            System.out.println("\"" + tok[0] + "\"" + " - " + st.toLowerCase());
        }
    }
}
