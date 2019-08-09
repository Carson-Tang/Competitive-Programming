import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine()), b = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        boolean [] r = new boolean[7001];
        long [] dp = new long[7001];
        LinkedList<Integer>h  = new LinkedList<>();
        h.add(0);h.add(990);h.add(1010);h.add(1970);h.add(2030);h.add(2940);h.add(3060);
        h.add(3930);h.add(4060);h.add(4970);h.add(5030);h.add(5990);h.add(6010);h.add(7000);
        for (int i = 0; i < n; i++) h.add(Integer.parseInt(br.readLine()));
        dp[0]=1;
        for(int i = 0; i < 7001; i++){
            if(dp[i]>0){
                for(int ho : h){
                    if(ho>i){
                        if(ho-i>=a&&ho-i<=b) dp[ho]+=dp[i];
                    }
                }
            }
        }
        System.out.println(dp[7000]);
    }
}
