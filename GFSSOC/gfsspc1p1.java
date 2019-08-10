import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(sc.readLine());
        int b = Integer.parseInt(sc.readLine());
        int c = Integer.parseInt(sc.readLine());
        if(a+b>c && b+c>a && a+c>b){
            System.out.println("Huh? A triangle?");
        } else {
            System.out.println("Maybe I should go out to sea...");
        }
    }
}
