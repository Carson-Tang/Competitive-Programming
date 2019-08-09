import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        String [] tok2 = br.readLine().split(" ");
        int [] freq = new int[100001];
        int [] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=Integer.parseInt(tok2[i]);
            freq[arr[i]]++;
        }
        long [] bitfreq = new long[100001];
        long [] bit = new long[n+1];
        for(int i = 0; i < n; i++) update(i,arr[i],n,bit);
        for(int i = 1; i < 100001; i++) update(i-1,freq[i],100000, bitfreq);
        for(int i = 0; i < m; i++){
            String [] tok3 = br.readLine().split(" ");
            if(tok3[0].equals("C")){
                int a = Integer.parseInt(tok3[1]), b = Integer.parseInt(tok3[2]);
                a--;
                freq[arr[a]]--;
                freq[b]++;
                update(arr[a]-1,-1,100000,bitfreq);
                update(b-1,1,100000,bitfreq);
                int val = b-arr[a];
                arr[a]=b;
                update(a,val,n,bit);
            } else if (tok3[0].equals("Q")){
                int v = Integer.parseInt(tok3[1]);
                System.out.println(sum(v,bitfreq));
            } else {
                int a = Integer.parseInt(tok3[1]), b = Integer.parseInt(tok3[2]);
                System.out.println(sum(b,bit)-sum(a-1,bit));
            }
        }
    }
    public static long sum(int ind, long [] arr){
        long tot = 0;
        while(ind>0){
            tot+=arr[ind];
            ind-=ind&(-ind);
        }
        return tot;
    }
    public static void update(int ind, int val, int n, long [] arr){
        ind++;
        while(ind<=n){
            arr[ind]+=val;
            ind+=ind&(-ind);
        }
    }
}
