import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String n = sc.readLine();
        int c = 0;
        for(int i =0; i < n.length(); i++) {
            if(n.charAt(i)=='a'){
                System.out.print("(car ");
                c++;
            } else if (n.charAt(i)=='d'){
                System.out.print("(cdr ");
                c++;
            }
        }
        System.out.print("x");
        for(int i = 0; i < c; i++){
            System.out.print(")");
        }
    }
}
