import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean prime [] = new boolean[10000001];
        Arrays.fill(prime,true);
        for(int i = 2; i < Math.sqrt(10000001); i++){
            if(prime[i]){
                for(int j = i*i; j < 10000001; j+=i){
                    prime[j]=false;
                }
            }
        }
        for(int i = 0; i <= 2; i++)prime[i]=false;
        for(int tc = 0; tc<5; tc++){
            String out = "";
            int n= Integer.parseInt(br.readLine());
            out+=Integer.toString(n)+" = ";
            if(prime[n]){
                out+=Integer.toString(n);
                System.out.println(out);
            } else {
                int p=-1,q=-1;
                int idx = n/2;
                while(idx>=0){
                    if(prime[idx]&&prime[n-idx]){
                        p=idx;
                        q=n-idx;
                        break;
                    }
                    idx--;
                }
                if(p==-1){
                    idx = n/3;
                    int r = -1;
                    while(idx>=0&&r==-1){
                        if(prime[idx]){
                            int idx2 = n-idx;
                            while(idx2>=0){
                                if(prime[idx2]&&prime[n-idx-idx2]&&idx2<=n-idx-idx2&&idx<=idx2){
                                    p = idx;
                                    q = idx2;
                                    r = n-idx-idx2;
                                    break;
                                }
                                idx2--;
                            }
                        }
                        idx--;
                    }
                    out += Integer.toString(p) + " + " + Integer.toString(q)+" + "+Integer.toString(r);
                    System.out.println(out);
                } else {
                    out += Integer.toString(p) + " + " + Integer.toString(q);
                    System.out.println(out);
                }
            }
        }

    }
}
