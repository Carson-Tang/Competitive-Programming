import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> x = new ArrayList<>();
        for(int i = 0; i < n; i++){
            x.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(x);
        int c = 0;
        int w = 0;
        for(int i = 0; i < n; i++){
            if(x.get(i)>=w){
                w += x.get(i);
                c++;
            }
        }
        System.out.println(c);
    }
}
