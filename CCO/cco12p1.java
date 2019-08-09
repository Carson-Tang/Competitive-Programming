import java.io.*;
import java.util.*;

public class Main {
    static class num{
        int ind,dis;
        num(int ind, int dis){
            this.ind=ind;
            this.dis=dis;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int [] pos = new int[d];
        for(int i = 0; i < d; i++) pos[i]= Integer.parseInt(br.readLine());
        ArrayList<Integer> fin = new ArrayList<>();
        LinkedList<num>q = new LinkedList<>();
        for(int a : pos) q.add(new num(a,1));
        int v = Integer.parseInt(br.readLine());
        int [] find = new int[v];
        int max = 0;
        for(int i = 0; i < v; i++){
            find[i]=Integer.parseInt(br.readLine());
            if(find[i]>max){
                max=find[i];
            }
        }
        Arrays.sort(pos);
        boolean [] vis = new boolean[max+1];
        int prev = 1;
        while(!q.isEmpty()){
            num e = q.poll();
            int val = e.ind, dist = e.dis;
            if(dist!=prev){
                prev=dist;
                vis=new boolean[max+1];
            }
            if(val<=max) {
                for (int i = 0; i < d; i++) {
                    int multi = val*pos[i];
                    int add = val+pos[i];
                    if(multi<=max) {
                        if(!vis[multi]) {
                            vis[multi]=true;
                            if (dist == w) {
                                fin.add(val * pos[i]);
                            } else {
                                q.add(new num(val * pos[i], dist + 1));
                            }
                        }
                    }
                    if(add<=max){
                        if(!vis[add]) {
                            vis[add]=true;
                            if (dist == w) {
                                fin.add(val + pos[i]);
                            } else {
                                q.add(new num(val + pos[i], dist + 1));
                            }
                        }
                    }
                }
            }
        }
        for(int i = 0; i < v; i++){
            if(fin.contains(find[i])){
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
