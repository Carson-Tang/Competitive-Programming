import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(sc.readLine());
        int n = Integer.parseInt(sc.readLine());
        int c = 0;
        String s;
        for(int i = m; i <= n; i++){
            s = Integer.toString(i);
            if(isValid(s)){
                if(isFlippable(s)){
                    c++;
                }
            }
        }
        System.out.println(c);
    }
    public static boolean isFlippable(String s){
        String f = "";
        for(int i =s.length()-1; i >=0; i--){
            if(s.charAt(i)=='6'){
                f += "9";
            } else if (s.charAt(i)=='9'){
                f += "6";
            } else {
                f += s.charAt(i);
            }
        }
        if(s.equals(f)){
            return true;
        }
        return false;
    }
    public static boolean isValid(String s){
        if(s.contains("2")){
            return false;
        }
        if(s.contains("3")){
            return false;
        }
        if(s.contains("4")){
            return false;
        }
        if(s.contains("5")){
            return false;
        }
        if(s.contains("7")){
            return false;
        }
        return true;
    }
}
