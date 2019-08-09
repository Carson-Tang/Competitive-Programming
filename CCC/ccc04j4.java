import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String key = sc.readLine();
        HashMap<Character, Integer> x = new HashMap<>();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i =0; i < 26; i++){
            x.put(alphabet.charAt(i),i);
        }
        String code = sc.readLine();
        String f = "";
        int a =0;
        for(int i = 0; i < code.length(); i++){
            if(Character.isLetter(code.charAt(i))) {
                a = a % key.length();
                int shift = ((x.get(code.charAt(i))) + x.get(key.charAt(a % key.length()))) % 26;
                a++;
                f += alphabet.charAt(shift);
            }
        }
        System.out.println(f);
    }
}
