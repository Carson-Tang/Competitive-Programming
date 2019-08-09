import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<String, Integer> x = new HashMap<>();
        x.put("I",1);
        x.put("V",5);
        x.put("X",10);
        x.put("L",50);
        x.put("C",100);
        x.put("D",500);
        x.put("M",1000);
        int t = 0;
        for(int i = 1; i < s.length(); i+=2){
            if(i==1){
                t += (Character.getNumericValue(s.charAt(i-1))*x.get(Character.toString(s.charAt(i))));
            } else {
                if(x.get(Character.toString(s.charAt(i))) > x.get(Character.toString(s.charAt(i-2)))){
                    t -= 2*x.get(Character.toString(s.charAt(i-2))) * (Character.getNumericValue(s.charAt(i-3)));
                    t += Character.getNumericValue(s.charAt(i - 1)) * x.get(Character.toString(s.charAt(i)));
                } else {
                    t += Character.getNumericValue(s.charAt(i - 1)) * x.get(Character.toString(s.charAt(i)));
                }
            }
        }
        System.out.println(t);
    }
}
