import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            x.add(Integer.parseInt(sc.readLine()));
        }
        Collections.sort(x);
        System.out.println(x.get(1));
    }
}
