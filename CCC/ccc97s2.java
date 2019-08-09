import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        for(int i = 0; i < d; i++){
            int n = Integer.parseInt(br.readLine());
             if (nasty(n)) System.out.println(n + " is nasty");
             else System.out.println(n + " is not nasty");
        }
    }
    public static boolean nasty(int n){
        ArrayList<Integer>factors = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                factors.add(i);
            }
        }
        for(int i = 0; i < factors.size(); i++){
            for(int j = 0; j < factors.size()-1; j++){
                if(i!=j) {
                    if (Math.abs(factors.get(factors.size() - i - 1) - factors.get(i)) == factors.get(j) + factors.get(j + 1)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
