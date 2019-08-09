import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedList<Integer>q = new LinkedList<>();
        int d = Integer.parseInt(br.readLine());
        int [] wait = new int[d+1];
        ArrayList<Integer>[]x = new ArrayList[d+1];
        for(int i = 0; i < d+1; i++) x[i]=new ArrayList<>();
        int [] barks = new int[d+1];
        for(int i = 1; i <= d; i++){
            wait[i]=Integer.parseInt(br.readLine());
        }
        int f = Integer.parseInt(br.readLine());
        for(int i = 0; i < f; i++){
            String [] tok = br.readLine().split(" ");
            x[Integer.parseInt(tok[0])].add(Integer.parseInt(tok[1]));
        }
        int t = Integer.parseInt(br.readLine());
        int [] state = new int[d+1];
        q.add(1);
        barks[1]=1;
        for(int i = 0; i <= t; i++){
            while(!q.isEmpty()){
                int e = q.poll();
                for(int neigh : x[e]){
                    if(state[neigh]==0){
                        state[neigh] = wait[neigh]+1;
                    }
                }
            }
            for(int k = 1; k <= d; k++){
                if(state[k]>0){
                    state[k]--;
                    if(state[k]==1){
                        q.add(k);
                    } else if (state[k]==0){
                        barks[k]++;
                    }
                }
            }
        }
        for(int i = 1; i <= d; i++) System.out.println(barks[i]);
    }
}
