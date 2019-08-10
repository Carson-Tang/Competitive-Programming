import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tokens = sc.readLine().split("\\+|\\=| ");
        if(Integer.parseInt(tokens[0]) + Integer.parseInt(tokens[3]) == Integer.parseInt(tokens[6])){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
