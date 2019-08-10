import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        n++;
        while(Integer.toString(n).contains("0")){
            n++;
        }
        System.out.println(n);
    }
}
