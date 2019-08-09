import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> [] x = new ArrayList[n+1];
        for(int i = 1; i <= n; i++){
            x[i] = new ArrayList<>();
        }
        for(int i = 1; i <= n; i++){
            String [] tok = br.readLine().split(" ");
            for(int k = 1; k <= Integer.parseInt(tok[0]); k++){
                x[i].add(Integer.parseInt(tok[k]));
            }
        }
        boolean [] visited = new boolean[n+1];
        LinkedList<Integer> q = new LinkedList<>();
        int [] dis = new int[n+1];
        int e;
        dis[1]=1;
        visited[1]=true;
        q.add(1);
        while(!q.isEmpty()){
            e = q.remove();
            for(int j = 0; j < x[e].size(); j++){
                if(!visited[x[e].get(j)]) {
                    q.add(x[e].get(j));
                    dis[x[e].get(j)] = dis[e] + 1;
                }
                visited[x[e].get(j)]=true;
            }
        }
        boolean f = true;
        for(int i = 1; i < n+1; i++){
            if(!visited[i]){
                f=false;
                break;
            }
        }
        if(f){
            System.out.println("Y");
        } else {
            System.out.println("N");
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < n+1; i++){
            if(dis[i]!=0 && x[i].isEmpty() && dis[i]<min){
                min=dis[i];
            }
        }
        System.out.println(min);
    }
}
