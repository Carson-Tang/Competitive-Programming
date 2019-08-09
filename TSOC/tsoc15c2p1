import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Integer [] x = new Integer[n];
        for(int i = 0; i < n; i++){
            x[i] = Integer.parseInt(sc.readLine());
        }
        int a =0;
        Map<Integer, Character> y = new HashMap<>();
        y.put(0,'a');
        y.put(1,'A');
        y.put(2,'B');
        y.put(3,'C');
        y.put(4,'D');
        y.put(5,'E');
        y.put(6,'F');
        y.put(7,'G');
        y.put(8,'H');
        y.put(9,'I');
        y.put(10,'J');
        y.put(11,'K');
        y.put(12,'L');
        y.put(13,'M');
        y.put(14,'N');
        y.put(15,'O');
        y.put(16,'P');
        y.put(17,'Q');
        y.put(18,'R');
        y.put(19,'S');
        y.put(20,'T');
        y.put(21,'U');
        y.put(22,'V');
        y.put(23,'W');
        y.put(24,'X');
        y.put(25,'Y');
        y.put(26,'Z');
        String s = "";
        boolean f = true;
        while(x[a]!=0){
            if(f) {
                a += x[a];
                s += y.get(x[a]);
                f = false;
            }
            a++;
            a += x[a];
            s += y.get(x[a]);
        }
        System.out.println(s.substring(0,s.length()-1));
    }
}
