import java.io.*;
import java.util.*;

public class Main {
    public static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        ArrayList<Integer>[]x = new ArrayList[n+1];
        for(int i = 0; i< n+1; i++){
            x[i]=new ArrayList<>();
        }
        while(true){
            String [] tok = br.readLine().split(" ");
            int a = Integer.parseInt(tok[0]), b = Integer.parseInt(tok[1]);
            if(a==0 && b==0){
                break;
            }
            x[b].add(a);
        }
        int [] dis = new int[n+1];
        dis[n]=1;
        for(int i: x[n]){
            dis[i]=1;
        }
        for(int i = n-1; i >= 1; i--){
            for(int k : x[i]){
                dis[k]+=dis[i];
            }
        }
        System.out.println(dis[1]);
    }
}
