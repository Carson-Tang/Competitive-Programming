import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String [] tok = sc.readLine().split(" ");
        Map<String, Integer> z = new HashMap<>();
        z.put("00", 1);
        int x = 0;
        int y = 0;
        int c =0;
        String s="";
        for(int i = 0; i< n; i++) {
            if(tok[i].equals("L")){
                x--;
                if(z.get(Integer.toString(x) + Integer.toString(y))!=null){
                    System.out.println("Fell at " + (i+1));
                    return;
                } else {
                    z.put(Integer.toString(x) + Integer.toString(y), 1);
                }
            } else if (tok[i].equals("R")){
                x++;
                if(z.get(Integer.toString(x) + Integer.toString(y))!=null){
                    System.out.println("Fell at " + (i+1));
                    return;
                } else {
                    z.put(Integer.toString(x) + Integer.toString(y), 1);
                }
            } else if (tok[i].equals("U")){
                y++;
                if(z.get(Integer.toString(x) + Integer.toString(y))!=null){
                    System.out.println("Fell at " + (i+1));
                    return;
                } else {
                    z.put(Integer.toString(x) + Integer.toString(y), 1);
                }
            } else if (tok[i].equals("D")){
                y--;
                if(z.get(Integer.toString(x) + Integer.toString(y))!=null){
                    System.out.println("Fell at " +(i+1));
                    return;
                } else {
                    z.put(Integer.toString(x) + Integer.toString(y), 1);
                }
            }
        }
        System.out.println("Safe!");
    }
}
