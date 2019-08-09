import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,String> m = new HashMap<>();
        ArrayList<Integer> y = new ArrayList<>();
        String s;
        int t;
        int i =0;
        while(true) {
            String [] tokens = sc.readLine().split(" ");
            s = tokens[0];
            if(s.equals("Waterloo")){
                i++;
            }
            t = Integer.parseInt(tokens[1]);
            y.add(t);
            m.put(t,s);
            if(i==1){
                Collections.sort(y);
                Collections.reverse(y);
                System.out.println(m.get(y.get(y.size()-1)));
                break;
            }
        }
    }
}
