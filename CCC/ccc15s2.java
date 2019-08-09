import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int j = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(br.readLine());
        int[] jerseys = new int[j + 1];
        int s;
        for (int i = 1; i <= j; i++) {
            String z = br.readLine();
            if (z.equals("M")) {
                jerseys[i] = 1;
            } else if (z.equals("S")) {
                jerseys[i] = 0;
            } else {
                jerseys[i] = 2;
            }
        }
        int t = 0;
        int c;
        for (int i = 0; i < a; i++) {
            String[] tok = br.readLine().split(" ");
            if (tok[0].equals("M")) {
                s = 1;
            } else if (tok[0].equals("S")) {
                s = 0;
            } else {
                s = 2;
            }
            c = Integer.parseInt(tok[1]);
            if (1 <= c && c <= j && jerseys[c] >= s) {
                t++;
                jerseys[c] = -1;
            }
        }
        System.out.println(t);
    }
}
