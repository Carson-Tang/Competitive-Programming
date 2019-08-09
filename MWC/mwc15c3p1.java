import java.io.*;
import java.util.*;

public class Main {
    static class lol implements Comparable<lol>{
        String name;
        int s;
        lol(String name, int s){
            this.name=name;
            this.s=s;
        }
        public int compareTo(lol a){
            return Integer.compare(a.s,this.s);
        }
    }
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> ind = new HashMap<>();
        String [] names = new String[n];
        int [] points = new int[n];
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            names[i]=tok[0];
            points[i]=Integer.parseInt(tok[1]);
            ind.put(tok[0],i);
        }
        int d = Integer.parseInt(br.readLine());
        for(int i = 0; i < d*n; i++){
            String [] tok = br.readLine().split(" ");
            int index = ind.get(tok[0]);
            points[index]+=Integer.parseInt(tok[1]);
        }
        ArrayList<lol> x = new ArrayList<>();
        for(int i = 0; i < n; i++){
            x.add(new lol(names[i],points[ind.get(names[i])]));
        }
        Collections.sort(x);
        int p = Integer.parseInt(br.readLine());
        System.out.println(x.get(p-1).name);
    }
}
