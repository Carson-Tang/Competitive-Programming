import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Integer [] freq = new Integer[1000001];
        for(int i = 0; i < 1000000; i++){
            freq[i] = 0;
        }
        String [] tok = br.readLine().split(" ");
        for(int i = 0; i < n; i++){
            freq[Integer.parseInt(tok[i])] = freq[Integer.parseInt(tok[i])] + 1;
        }
        ArrayList<Integer> x = new ArrayList<>();
        for(int i =0; i < 1000000; i++){
            if(freq[i]!=0){
                x.add(freq[i]);
            }
        }
        Collections.sort(x);
        int min = x.get(0);
        int max = x.get(x.size()-1);
        for(int i = 0; i < 1000000; i++){
            if(freq[i] == min){
                min = i;
                break;
            }
        }
        for(int i = 1000000-1; i >=0; i--){
            if(freq[i] == max){
                max = i;
                break;
            }
        }
        System.out.println(Math.abs(max-min));
    }
}
