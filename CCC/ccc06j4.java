import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer>[]x = new ArrayList[8];
        for(int i = 1; i <= 7; i++) x[i] = new ArrayList<>();
        x[7].add(1);
        x[4].add(1);
        x[1].add(2);
        x[4].add(3);
        x[5].add(3);
        while(true){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            if(a==0&&b==0){
                break;
            }
            x[b].add(a);
        }
        ArrayList<Integer> out = new ArrayList<>();
        int min = -1;
        for(int i = 1; i <= 7; i++){
            if(x[i].size()==0){
                min=i;
                break;
            }
        }
        LinkedList<Integer>q = new LinkedList<>();
        q.add(min);
        boolean [] vis = new boolean[8];
        while(!q.isEmpty()){
            int e = q.poll();
            vis[e]=true;
            out.add(e);
            for(int i = 1; i <= 7; i++){
                for(int k = 0; k < x[i].size(); k++){
                    if(x[i].get(k)==e){
                        x[i].remove(k);
                    }
                }
            }
            min = -1;
            for(int i = 1; i <= 7; i++){
                if(x[i].size()==0 && !vis[i]){
                    min=i;
                    break;
                }
            }
            if(min!=-1){
                q.add(min);
            }
        }
        if(out.size()!=7){
            System.out.println("Cannot complete these tasks. Going to bed.");
        } else {
            for(int e : out){
                System.out.print(e + " ");
            }
        }
    }
}
