import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        String test;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            for(int k = s.length() ; k >i ; k--){
                if(i!=k) {
                    test = s.substring(i, k);
                    if (isPal(test)) {
                        if (test.length() > max) {
                            max = test.length();
                        }
                    }
                }
            }
        }
        System.out.println(max);

    }
    public static boolean isPal(String s){
        StringBuilder x = new StringBuilder();
        x = x.append(s);
        x.reverse();
        if(s.equals(x.toString())){
            return true;
        }
        return false;
    }
}
