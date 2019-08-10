import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int c = Integer.parseInt(tok[1]);
        int m = Integer.parseInt(tok[2]);
        String z="";
        Map<String, Integer> x = new HashMap<>();
        ArrayList<Integer> y = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String [] t = br.readLine().split(" ");
            for(int k = 0; k < t.length-1; k++){
                z += t[k];
            }
            x.put(z,Integer.parseInt(t[t.length-1]));
            y.add(Integer.parseInt(t[t.length-1]));
            z = "";

        }
        long t = 0;
        String s;
        boolean a = false;
        for(int i = 0; i < m; i++){
            s = br.readLine().replace(" ","");
            if(x.get(s)==null){
                a = true;
            } else {
                t += x.get(s);
                y.remove(x.get(s));
            }
        }
        Collections.sort(y);
        for(int i = 0; i < c-m; i++){
            if(y.size()>0) {
                t += y.get(y.size() - 1);
                y.remove(y.size() - 1);
            } else {
                System.out.println("Ace is dunzos");
                return;
            }
        }
        if(a){
            System.out.println("Ace is dunzos");
            return;
        }
        if(n<c){
            System.out.println("Ace is dunzos");
            return;
        }
        System.out.println(String.format("%.2f",((double)t/c)));
    }
}
