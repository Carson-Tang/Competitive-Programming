import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        if(s.length()==1){
            System.out.println("NO");
            return;
        }
        String r = "";
        String f = "";
        for(int i = 0; i < s.length()-1; i++){
            r = s.substring(0,i+1);
            f = s.substring(i+1, s.length());
            if(isPal(r)){
                if(isPal(f)){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
    public static boolean isPal(String s){
        String f = "";
        for(int i = s.length()-1; i >= 0 ; i--){
            f += s.charAt(i);
        }
        if(f.equals(s)){
            return true;
        }
        return false;
    }
}
