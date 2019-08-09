import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        for(int i = 0; i < l; i++){
            int n = Integer.parseInt(br.readLine());
            int origtime = n*10;
            Map<String,Integer> key = new HashMap<>();
            ArrayList<Integer>[]x = new ArrayList[101];
            for(int k = 0; k < 101; k++) x[k]=new ArrayList<>();
            int end = -1,last=-1;
            for(int k = 0; k < n; k++){
                String b = br.readLine();
                if(key.get(b)==null) key.put(b,key.size());
                if(k==0) end = key.get(b);
                if(k>0) {
                    x[key.get(b)].add(last);
                    x[last].add(key.get(b));
                }
                last = key.get(b);
            }
            x[end].add(last);
            x[last].add(end);
            boolean [] vis = new boolean[101];
            int [] dis = new int[101];
            LinkedList<Integer> q = new LinkedList<>();
            q.add(last);
            while(!q.isEmpty()){
                int curr = q.poll();
                vis[curr]=true;
                for(int neigh : x[curr]){
                    if(!vis[neigh]){
                        vis[neigh]=true;
                        dis[neigh] = dis[curr]+1;
                        q.add(neigh);
                    }
                }
            }
            int max = 0;
            for(int k = 0; k < 101; k++) max = Integer.max(max,dis[k]);
            int newtime = max*20;
            System.out.println(origtime - newtime);
        }
    }
}
