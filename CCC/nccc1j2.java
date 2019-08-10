import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i)==s.charAt(i+1)){
                System.out.println("Even");
                return;
            }
        }
        System.out.println("Odd");
    }
}
