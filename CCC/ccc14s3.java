import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(sc.readLine());
        ArrayList<Integer> x = new ArrayList<>();
        Deque<Integer> y = new ArrayDeque<>();
        for (int k = 0; k < t; k++) {
            int n = Integer.parseInt(sc.readLine());
            for (int i = 0; i < n; i++) {
                x.add(Integer.parseInt(sc.readLine()));
            }
            int c = 1;
            while (true) {
                if (x.size() >= 1 && y.size() >= 1) {
                    if (x.get(x.size() - 1) == c) {
                        x.remove(x.size() - 1);
                        c++;
                    } else if (y.peek() == c) {
                        y.pop();
                        c++;
                    } else {
                        y.addFirst(x.get(x.size() - 1));
                        x.remove(x.size() - 1);
                    }
                } else if (x.size() >= 1) {
                    if (x.get(x.size() - 1) == c) {
                        x.remove(x.size() - 1);
                        c++;
                    } else {
                        y.addFirst(x.get(x.size() - 1));
                        x.remove(x.size() - 1);
                    }
                } else if (y.size() >= 0) {
                    if (y.peek() == c) {
                        y.pop();
                        c++;
                    } else {
                        System.out.println("N");
                        x.clear();
                        y.clear();
                        break;
                    }
                }
                if (c == n) {
                    System.out.println("Y");
                    x.clear();
                    y.clear();
                    break;
                }
            }
        }
    }
}
