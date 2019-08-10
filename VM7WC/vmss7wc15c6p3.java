import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer>[]x = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++) x[i]=new ArrayList<>();
        for(int i = 0; i < n-1; i++){
            String [] tok = br.readLine().split(" ");
            int a = Integer.parseInt(tok[0]), b = Integer.parseInt(tok[1]);
            x[a].add(b);
        }
        String [] tok = br.readLine().split(" ");
        int [] characters = new int[n+1];
        for(int i = 1; i < n+1; i++) characters[i] = Integer.parseInt(tok[i-1]);
        for(int i = n; i > 0; i--){
            int total = characters[i];
            for(int k = 0; k < x[i].size(); k++){
                total+=characters[x[i].get(k)];
            }
            characters[i]=total;
        }
        int max = Integer.MAX_VALUE * -1;
        for(int i = 1; i < n+1; i++){
            if(characters[i]>max) max = characters[i];
        }
        System.out.println(max);
    }
}
