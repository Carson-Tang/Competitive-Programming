import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] to = br.readLine().split(" ");
        int n = Integer.parseInt(to[0]);
        int t = Integer.parseInt(to[1]);
        Map<String, Integer> y = new HashMap<>();
        y.put("home",0);
        y.put("Waterloo GO",1);
        String s;
        for(int i = 0; i < n; i++){
            s=br.readLine();
            if(y.get(s)==null){
                y.put(s,y.size());
            }
        }
        ArrayList<Integer> [] x = new ArrayList[y.size()+1];
        for(int i = 0; i < y.size()+1; i++){
            x[i] = new ArrayList<>();
        }
        int xr,yr;
        for(int i = 0; i < t; i++){
            String [] tok = br.readLine().split("-");
            xr=y.get(tok[0]);
            yr=y.get(tok[1]);
            x[xr].add(yr);
            x[yr].add(xr);
        }
        LinkedList<Integer> q = new LinkedList<>();
        q.add(0);
        boolean [] visited = new boolean[y.size()+1];
        visited[0]=true;
        int [] dis = new int[y.size()+1];
        int e;
        while(!q.isEmpty()){
            e=q.remove();
            for(int i = 0; i < x[e].size(); i++){
                if(!visited[x[e].get(i)]){
                    visited[x[e].get(i)]=true;
                    q.add(x[e].get(i));
                    dis[x[e].get(i)]=dis[e]+1;
                }
            }
        }
        if(dis[1]!=0){
            System.out.println(dis[1]);
        } else {
            System.out.println("RIP ACE");
        }
    }
}
