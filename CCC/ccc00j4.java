import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        ArrayList<Double> x = new ArrayList<>();
        int r;
        for (int i = 0; i < n; i++) {
            r = Integer.parseInt(sc.readLine());
            x.add((double) r);
        }
        String s;
        int a, b;
        while (true) {
            s = sc.readLine();
            if (s.equals("77")) {
                for (double e : x) {
                    System.out.print((int)e + " ");
                }
                return;
            } else if (s.equals("99")) {
                a = Integer.parseInt(sc.readLine());
                b = Integer.parseInt(sc.readLine());
                x.add(a - 1, x.get(a - 1) * ((double) b / 100));
                x.add(a + 1, x.get(a) * ( 1 - (double)b / 100));
                x.remove(a);
            } else if (s.equals("88")) {
                a = Integer.parseInt(sc.readLine());
                x.add(a-1, x.get(a) + x.get(a - 1));
                x.remove(a);
                x.remove(a);
            }
        }
    }
}
