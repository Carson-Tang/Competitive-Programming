import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum =0;
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            if(k==0) {
                x.remove(x.size()-1);
            } else {
                x.add(k);
            }
        }
        for(int j = 0; j < x.size(); j++) {
            sum += x.get(j);
        }
        System.out.println(sum);
    }
}
