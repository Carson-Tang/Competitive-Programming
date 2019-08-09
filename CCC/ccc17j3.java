import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = sc.readLine().split(" ");
        String[] tokens1 = sc.readLine().split(" ");
        int n = Integer.parseInt(sc.readLine());
        int a = Math.abs(Integer.parseInt(tokens[0]) - Integer.parseInt(tokens1[0])) + Math.abs(Integer.parseInt(tokens[1]) - Integer.parseInt(tokens1[1]));
        if (a <= n && ((n - a) % 2) == 0) {
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
    }
}
