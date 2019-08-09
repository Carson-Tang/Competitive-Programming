import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        for(int i = 0; i < n; i++){
            String z = "abcdefghijklmnopqrstuvwxyz";
            String s = sc.readLine();
            for(int k = 0; k < s.length(); k++) {
                if(Character.isUpperCase(s.charAt(k))){
                    if(z.contains(Character.toString(Character.toLowerCase(s.charAt(k))))){
                        z = z.replace(Character.toString(Character.toLowerCase(s.charAt(k))), "");
                    }
                } else {
                    if(z.contains(Character.toString(s.charAt(k)))){
                        z = z.replace(Character.toString(s.charAt(k)),"");
                    }
                }
            }
            if(z.equals("")){
                System.out.println("pangram");
            } else {
                System.out.println("missing " + z);
            }
        }
    }
}
