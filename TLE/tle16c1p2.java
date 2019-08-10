import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double mean = 0;
        Map<Integer,Integer>freq = new HashMap<>();
        ArrayList<Integer>t = new ArrayList<>();
        for(int i = 0; i < n; i++){
            int w= Integer.parseInt(br.readLine());
            if(freq.get(w)==null){
                freq.put(w,1);
            } else {
                freq.put(w,freq.get(w)+1);
            }
            mean+=w;
            t.add(w);
        }
        mean/=n;
        double min = Integer.MAX_VALUE;
        min = Math.min(min,mean);
        Collections.sort(t);
        double median=0;
        if(t.size()%2==0){
            median += t.get(t.size()/2);
            median += t.get(t.size()/2-1);
            median/=2;
        } else {
            median=t.get(t.size()/2);
        }
        min=Math.min(min,median);
        int maxfreq=0;
        ArrayList<Integer> mode = new ArrayList<>();
        for(int a : freq.values()){
            if(a>maxfreq){
                maxfreq=a;
            }
        }
        for(int a : freq.keySet()){
            if(freq.get(a)==maxfreq){
                mode.add(a);
            }
        }
        double mod = 0;
        for(int a : mode) mod+= a;        
        mod/=mode.size();
        min=Math.min(min,mod);
        int cnt = 0;
        for(int a : t){
            if(a<=min) cnt++;
        }
        System.out.println(cnt);
    }
}
