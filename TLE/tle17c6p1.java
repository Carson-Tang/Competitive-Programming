import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String s = sc.readLine();
        if(n%2!=0){
            System.out.println("No");
            return;
        }
        Map<String, Integer> x = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(x.get(Character.toString(s.charAt(i)))!=null){
                x.put(Character.toString(s.charAt(i)),x.get(Character.toString(s.charAt(i)))+1);
            } else {
                x.put(Character.toString(s.charAt(i)),1);
            }
        }
        ArrayList<Integer> y = new ArrayList<>();
        for(int z : x.values() ){
            y.add(z);
        }
        Collections.sort(y);
        if(y.get(y.size()-1)<=n/2){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
