import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Long> x = new ArrayList<>();
        int n = Integer.parseInt(sc.readLine());
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                x.add((long)2*(i)+2*(n/i));
            }
        }
        Collections.sort(x);
        System.out.println(x.get(0));
    }
}
