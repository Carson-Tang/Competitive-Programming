import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String [] t = sc.readLine().split(" ");
        HashMap<String,Integer> x = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(x.get(t[i])!=null){
                x.put(t[i], x.get(t[i])+1);
            } else {
                x.put(t[i], 1);
            }
        }
        ArrayList<Integer> y = new ArrayList<>();
        for(int z : x.values()){
            y.add(z);
        }
        Collections.sort(y);
        System.out.println(y.get(y.size()-1));
    }
}
