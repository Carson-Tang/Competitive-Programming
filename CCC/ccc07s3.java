import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> [] x = new ArrayList[10000];
        for(int i = 0; i < 10000; i++){
            x[i] = new ArrayList<>();
        }
        int xc,yc;
        for(int i  =0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            xc = Integer.parseInt(tok[0]);
            yc = Integer.parseInt(tok[1]);
            x[xc].add(yc);
        }
        while(true){
            String [] tok = br.readLine().split(" ");
            xc = Integer.parseInt(tok[0]);
            yc = Integer.parseInt(tok[1]);
            if(xc==0 && yc==0){
                return;
            }
            bfs(x,xc,yc);
        }
    }
    public static void bfs(ArrayList<Integer> [] x, int start, int end){
        LinkedList<Integer> q = new LinkedList<>();
        int e;
        boolean [] visited = new boolean[10000];
        visited[start]=true;
        q.add(start);
        int [] dis = new int[10000];
        while(!q.isEmpty()){
            e=q.remove();
            for(int i = 0; i< x[e].size(); i++){
                if(!visited[x[e].get(i)]){
                    visited[x[e].get(i)]=true;
                    dis[x[e].get(i)]=dis[e]+1;
                    q.add(x[e].get(i));
                }
            }
        }
        if(dis[end]==0){
            System.out.println("No");
        } else {
            System.out.println("Yes " + (dis[end]-1));
        }
    }
}
