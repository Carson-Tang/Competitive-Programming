import java.io.*;
import java.util.*;

public class Main {
    public static String a = "abcdefghijklm";
    public static String alpha = "abcdefghijklmnopqrstuvwxyz";
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<Character> x = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            x.add(s.charAt(i));
        }

        for(int i = s.length()-1; i >= 0; i--){
            round(i,x);
        }
        for(char z : x){
            System.out.print(z);
        }
    }
    public static void round(int i, ArrayList<Character> x){
        if(a.contains(Character.toString(x.get(i)))){
            x.set(i,'a');
            for(char z : x){
                System.out.print(z);
            }
            System.exit(0);
        } else {
            x.set(i,'a');
            if(i==0){
                x.add(0,'a');
                for(char z : x){
                    System.out.print(z);
                }
                System.exit(0);
            }
            else if(x.get(i-1)=='z'){
                round(i-1,x);
            } else {
                x.set(i - 1, alpha.charAt(alpha.indexOf(x.get(i - 1)) + 1));
                for(char z : x){
                    System.out.print(z);
                }
                System.exit(0);
            }
        }
    }
}
