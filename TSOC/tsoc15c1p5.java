import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        ArrayList<Integer>[]x = new ArrayList[n+1];
        for(int i = 0; i <= n; i++){
            x[i]=new ArrayList<>();
        }
        for(int i = 0; i < m; i++){
            String [] t = br.readLine().split(" ");
            int xc = Integer.parseInt(t[0]), yc = Integer.parseInt(t[1]);
            x[xc].add(yc);
            x[yc].add(xc);
        }
        int w = Integer.parseInt(br.readLine());
        boolean [] vis = new boolean[n+1];
        boolean [] antsvis = new boolean[n+1];
        LinkedList<Integer>ants = new LinkedList<>();
        for(int i = 0; i < w; i++){
            int ant = Integer.parseInt(br.readLine());
            ants.add(ant);
            antsvis[ant]=true;
        }
        LinkedList<Integer>q = new LinkedList<>();
        q.add(1);
        int [] dis = new int[n+1];
        int count = 0;
        while(!q.isEmpty()){
            count++;
            if(count==4){
                int size = ants.size();
                for(int i = 0; i < size; i++){
                    int f = ants.poll();
                    for(int k = 0; k < x[f].size(); k++){
                        if(!antsvis[x[f].get(k)]){
                            //System.out.println(x[f].get(k));
                            ants.add(x[f].get(k));
                            antsvis[x[f].get(k)]=true;
                        }
                    }
                }
                count=0;
            }
            int e = q.poll();
            vis[e]=true;
            for(int i = 0; i < x[e].size(); i++){
                if(!vis[x[e].get(i)] && !antsvis[x[e].get(i)]){
                    vis[x[e].get(i)]=true;
                    q.add(x[e].get(i));
                    dis[x[e].get(i)]=dis[e]+1;
                }
            }

        }
        if(dis[n]==0){
            System.out.println("sacrifice bobhob314");
        } else {
            System.out.println(dis[n]);
        }
    }
}
