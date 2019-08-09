import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        ArrayList<Integer> [] h = new ArrayList[n+1];
        for(int i = 0; i < n+1; i++){
            h[i]=new ArrayList<>();
        }
        int x,y;
        for(int i = 0; i < m ; i++){
            String [] t = br.readLine().split(" ");
            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            h[x].add(y);
        }
        String [] to = br.readLine().split(" ");
        int start = Integer.parseInt(to[0]);
        int end = Integer.parseInt(to[1]);
        LinkedList<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[n+1];
        int e;
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            e=q.remove();
            for(int i = 0; i < h[e].size(); i++){
                if(!visited[h[e].get(i)]){
                    visited[h[e].get(i)]=true;
                    q.add(h[e].get(i));
                }
            }
        }
        if(visited[end]){
            System.out.println("yes");
        } else {
            q.clear();
            for(int i = 0; i < visited.length; i++){
                visited[i]=false;
            }
            q.add(end);
            visited[end]=true;
            while(!q.isEmpty()){
                e=q.remove();
                for(int i = 0; i < h[e].size(); i++){
                    if(!visited[h[e].get(i)]){
                        visited[h[e].get(i)]=true;
                        q.add(h[e].get(i));
                    }
                }
            }
            if(visited[start]){
                System.out.println("no");
            } else {
                System.out.println("unknown");
            }
        }
    }
}
