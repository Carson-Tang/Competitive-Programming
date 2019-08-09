import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String s;
        for(int i = 0; i < n; i++){
            s = br.readLine();
            if(possible(a,b,s)){
                System.out.println("Possible baby.");
            } else {
                System.out.println("Not their baby!");
            }
        }
    }
    public static boolean possible(String a, String b, String s){
        int c = 0;
        for(int i = 0; i < 5; i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                if (!Character.isUpperCase(a.charAt(i+c)) && !Character.isUpperCase(b.charAt(i+c))) {
                    return false;
                }
            } else {
                if(Character.isUpperCase(a.charAt(i+c+1))||Character.isUpperCase(b.charAt(i+c+1))){
                    return false;
                }
            }
            c++;
        }
        return true;
    }
}
