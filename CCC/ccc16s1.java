import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        String f = sc.readLine();
        int c =0;
        for(int i = 0; i < f.length(); i++) {
            if(f.charAt(i)=='*'){
                c++;
            } else {
                s = s.replaceFirst(Character.toString(f.charAt(i)), "");
            }
        }
        if(s.length()-c==0){
            System.out.println("A");
        } else {
            System.out.println("N");
        }
    }
}
