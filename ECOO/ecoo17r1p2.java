import java.io.*;
import java.util.*;

public class Main {
    static class cho implements Comparable<cho>{
        String s;
        int p,f,g,t;
        cho(String s,int p, int f, int g, int t){
            this.s=s;
            this.p=p;
            this.f=f;
            this.g=g;
            this.t=t;
        }
        public int compareTo(cho a){
            if(a.t!=this.t) return Integer.compare(a.t,this.t);
            if(a.g!=this.g) return Integer.compare(a.g,this.g);
            if(a.f!=this.f) return Integer.compare(a.f,this.f);
            if(a.p!=this.p) return Integer.compare(a.p,this.p);
            return 0;
        }
    }
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int tc = 0; tc < 10; tc++){
            int n = Integer.parseInt(br.readLine());
            String s = "";
            ArrayList<cho> x = new ArrayList<>();
            for(int i = 0; i < n; i++){
                String choc;
                if(s.isEmpty()) choc = br.readLine();
                else choc = s;
                int [] arr = new int[3];
                while(true) {
                    String[] tok = br.readLine().split(" ");
                    if(!tok[0].equals("J")){
                        if(!tok[0].equals("*")){
                            s = tok[0];
                        }
                        break;
                    } else {
                        arr[0]+=Integer.parseInt(tok[1]);
                        arr[1]+=Integer.parseInt(tok[2]);
                        arr[2]+=Integer.parseInt(tok[3]);
                    }
                }
                x.add(new cho(choc,arr[0],arr[1],arr[2],arr[0]+arr[1]+arr[2]));
            }
            Collections.sort(x);
            int a = x.get(0).p, b = x.get(0).f, c = x.get(0).g;
            String o = "";
            for(cho d : x){
                if(d.p==a && d.f==b && d.g==c){
                    o += d.s + ",";
                }
            }
            o = o.substring(0, o.length()-1);
            System.out.println(o);
        }
    }
}
