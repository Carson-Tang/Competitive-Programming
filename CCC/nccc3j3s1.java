import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        Map<Character, Integer> z = new HashMap<>();
        String a = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0; i < 26; i++){
            z.put(a.charAt(i),0);
        }
        for(int i = 0; i < s.length(); i++) {
            z.put(s.charAt(i),z.get(s.charAt(i)) + 1);
        }
        ArrayList<Integer> max = new ArrayList<>();
        for(int b : z.values()) {
            max.add(b);
        }
        Collections.sort(max);
        System.out.println(s.length()-max.get(max.size()-1) - max.get(max.size()-2));
    }
}
