import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException  {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        ArrayList<String> x = new ArrayList<>();
        for(int j = 0; j < n; j++) {
            String [] tokens = sc.readLine().split(" ");
            for (int i = 0; i < tokens.length; i++) {
                if (tokens[i].length() == 4) {
                    x.add("****");
                } else {
                    x.add(tokens[i]);
                }
            }
            for (int k = 0; k < x.size(); k++) {
                System.out.print(x.get(k) + " ");
            }
            System.out.println("");
            x.clear();
        }
    }
}
