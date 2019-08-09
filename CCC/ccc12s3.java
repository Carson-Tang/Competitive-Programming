import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Integer[] x = new Integer[1001];
        int a;
        for (int i = 0; i < 1001; i++) {
            x[i] = 0;
        }
        for (int i = 1; i <= n; i++) {
            a = Integer.parseInt(sc.readLine());
            x[a] = x[a] + 1;
        }
        int m = x[0];
        int b = 0;
        for (int i : x) {
            if (i > m) {
                m = i;
            }
        }
        if (m == 1) {
            b = 1;
        } else {
            for (int i : x) {
                if (i < m && i > b) {
                    b = i;
                }
            }
        }
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> min = new ArrayList<>();
        for (int i = 1000; i >= 1; i--) {
            if (x[i] == m) {
                max.add(i);
            }
        }
        Collections.sort(max);
        if(max.size()>=2){
            System.out.println(Math.abs(max.get(0)-max.get(max.size()-1)));
            return;
        }
        for (int i = 1000; i >= 1; i--) {
            if (x[i] == b) {
                min.add(i);
            }
        }
        Collections.sort(min);
        if(max.get(0)>min.get(0)) {
            System.out.println(Math.abs(min.get(0) - max.get(0)));
        } else {
            System.out.println(Math.abs(min.get(min.size() - 1) - max.get(0)));
        }
    }
}
