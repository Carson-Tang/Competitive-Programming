import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]), m = Integer.parseInt(tok[1]);
        ArrayList<Integer>[]x = new ArrayList[n];
        for(int i = 0; i < n; i++) x[i]=new ArrayList<>();
        int [] indeg = new int[n];
        for(int i = 0; i < m; i++){
            String [] tok2 = br.readLine().split(" ");
            int a = Integer.parseInt(tok2[0]), b = Integer.parseInt(tok2[1]);
            x[a].add(b);
            indeg[b]++;
        }
        int cnt = 0;
        int [] dis = new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        Stack<Integer>s = new Stack<>();
        for(int i = 0; i < n; i++){
            if(indeg[i]==0){
                dis[i]=1;
                s.add(i);
                cnt++;
            }
        }
        while(!s.isEmpty()){
            int curr = s.pop();
            if(x[curr].size()>0){
                if(x[curr].size()==1){
                    if(dis[x[curr].get(0)] > dis[curr]+1){
                        dis[x[curr].get(0)] = dis[curr]+1;
                    }
                    s.add(x[curr].get(0));
                } else {
                    cnt--;
                    for(int neigh : x[curr]){
                        s.add(neigh);
                        if(dis[neigh]>dis[curr]+1){
                            dis[neigh]=dis[curr]+1;
                        }
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
        for(int i = 0; i < n; i++){
            if(x[i].size()==0) System.out.print(dis[i]+" ");
        }
    }
}
