import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s;
        Map<String, Double> x = new HashMap<>();
        x.put("red", (double)0);
        x.put("orange", (double)0);
        x.put("blue",(double) 0);
        x.put("green", (double)0);
        x.put("yellow", (double)0);
        x.put("pink", (double)0);
        x.put("brown",(double) 0);
        x.put("violet", (double)0);
        int total = 0;
        for (int i = 0; i < 10; i++) {
            while (true) {
                s = sc.readLine();
                if (s.equals("end of box")) {
                    for (String a : x.keySet()) {
                        if (!a.equals("red")) {
                            total += Math.ceil(x.get(a) / 7) * 13;
                        }
                    }

                    //red
                    total += x.get("red") * 16;
                    System.out.println(total);
                    break;
                } else {
                    x.put(s, x.get(s) + 1);
                }
            }
            for (String a : x.keySet()) {
                x.put(a,(double) 0);
            }
            total = 0;
        }
    }
}
