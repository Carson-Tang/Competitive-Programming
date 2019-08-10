import java.io.*;
import java.util.*;

public class Main {
    static class prob implements Comparable<prob>{
        int ind, pref;
        prob(int ind , int pref){
            this.ind=ind;
            this.pref=pref;
        }
        public int compareTo(prob a){
            if(this.pref<a.pref) return -1;
            else if (this.pref>a.pref) return 1;
            else if(this.ind>a.ind) return 1;
            else if (this.ind<a.ind) return -1;
            return 0;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Map<String, Integer> p = new HashMap<>();
        for(int i = 1; i <= t; i++) p.put(br.readLine(),i);
        int n = Integer.parseInt(br.readLine());
        ArrayList<prob> x = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            x.add(new prob(i,p.get(br.readLine())));
        }
        Collections.sort(x);
        for(prob a : x){
            System.out.println(a.ind);
        }
    }
}
