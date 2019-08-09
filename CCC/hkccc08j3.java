import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, String> namestonumber = new HashMap<>();
        Map<String, Integer> freq = new HashMap<>();
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            namestonumber.put(tok[1],tok[0]);
            freq.put(tok[1],0);
        }
        String s;
        int d = Integer.parseInt(br.readLine());
        for(int i = 0 ; i< d; i++){
            s = br.readLine();
            if(freq.get(s)!=null){
                freq.put(s, freq.get(s)+1);
            }
        }
        int max = 0;
        for(int f : freq.values()){
            if(f>max){
                max=f;
            }
        }
        ArrayList<Integer> x = new ArrayList<>();
        for(String z : freq.keySet()){
            if(freq.get(z)==max){
                x.add(Integer.parseInt(z));
            }
        }
        Collections.sort(x);
        for(String f : namestonumber.keySet()){
            if(Integer.parseInt(f)==x.get(0)){
                System.out.println(namestonumber.get(f));
            }
        }
    }
}
