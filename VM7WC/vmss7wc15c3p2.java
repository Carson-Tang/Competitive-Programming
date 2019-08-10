import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = sc.readLine().split(" ");
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 0; i < Integer.parseInt(tok[0]); i++) {
            x.add(Integer.parseInt(sc.readLine()));
        }
        Collections.sort(x);
        int s=0;
        for(int i = 0; i < Integer.parseInt(tok[1]); i++) {
            if(x.get(x.size()-i-1)>0){
                s+=x.get(x.size()-i-1);
            } else {
                System.out.println(s);
                return;
            }
        }
        System.out.println(s);
    }
}
