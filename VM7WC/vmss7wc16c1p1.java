import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        if (n == 1) {
            return;
        }
        List<Integer> x = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                x.add(i);
                n /= i;
            }
        }
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
    }
}
