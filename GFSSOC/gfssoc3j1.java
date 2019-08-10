import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String t = sc.readLine();
        String b = sc.readLine();
        t = t.replace(" ","");
        b = b.replace(" ","");
        if(t.contains("red")||t.contains("green")||t.contains("white")){
            if(b.contains("red") || b.contains("green") || b.contains("white")){
                System.out.println("Jingle Bells");
            } else{
            System.out.println("Boring...");
        }
        } else{
            System.out.println("Boring...");
        }
    }
}
