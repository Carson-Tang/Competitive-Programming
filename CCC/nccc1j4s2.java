import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        Map<Character, String> z = new HashMap<>();
        String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 10; i < 36; i++){
            z.put(a.charAt(i-10), String.valueOf(i));
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [][]  x = new String[n][n];
        Map<String, Integer> y = new HashMap<>();
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            for(int k = 0; k < n; k++){
                if(Character.isLetter(s.charAt(k))){
                    x[i][k] = z.get(s.charAt(k));
                } else {
                    x[i][k] = Character.toString(s.charAt(k));
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                if(y.get(x[i][k])==null){
                    y.put(x[i][k],0);
                } else {
                    System.out.println("No");
                    return;
                }
            }
            y.clear();
        }
        y.clear();
        for(int i = 0; i < n; i++){
            for(int k = 0; k < n; k++){
                if(y.get(x[k][i])==null){
                    y.put(x[k][i],0);
                } else {
                    System.out.println("No");
                    return;
                }
            }
            y.clear();
        }
        for(int i = 0; i < n-1; i++){
            if(Integer.parseInt(x[0][i]) > Integer.parseInt(x[0][i+1])){
                System.out.println("Latin");
                return;
            }
        }
        for(int i = 0; i < n-1; i++){
            if(Integer.parseInt(x[i][0]) > Integer.parseInt(x[i+1][0])){
                System.out.println("Latin");
                return;
            }
        }
        System.out.println("Reduced");
    }
}
