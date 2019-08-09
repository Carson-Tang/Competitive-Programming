import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> [] g = new ArrayList[51];
        for(int i = 0; i< 51; i++){
            g[i] = new ArrayList<>();
        }
        ArrayList<Integer> friends = new ArrayList<>();
        Set<Integer> z = new HashSet<>();
        g[1].add(6);
        g[2].add(6);
        g[3].add(15); g[3].add(6); g[3].add(4); g[3].add(5);
        g[4].add(6); g[4].add(3); g[4].add(5);
        g[5].add(3); g[5].add(4); g[5].add(6);
        g[6].add(2); g[6].add(1); g[6].add(7); g[6].add(5); g[6].add(4); g[6].add(3);
        g[7].add(6); g[7].add(8);
        g[8].add(7); g[8].add(9);
        g[9].add(8); g[9].add(10); g[9].add(12);
        g[10].add(9); g[10].add(11);
        g[11].add(10); g[11].add(12);
        g[12].add(13); g[12].add(11); g[12].add(9);
        g[13].add(12); g[13].add(14); g[13].add(15);
        g[14].add(13);
        g[15].add(3); g[15].add(13);
        g[16].add(17); g[16].add(18);
        g[17].add(16); g[17].add(18);
        g[18].add(16); g[18].add(17);
        LinkedList<Integer> q = new LinkedList<>();
        int e;
        String s;
        int x,y;
        while(true){
            s = br.readLine();
            if(s.equals("i")){
                x = Integer.parseInt(br.readLine());
                y = Integer.parseInt(br.readLine());
                g[x].add(y);
                g[y].add(x);
            } else if (s.equals("d")){
                x = Integer.parseInt(br.readLine());
                y = Integer.parseInt(br.readLine());
                for(int i = 0; i < g[x].size(); i++){
                    if(g[x].get(i)==y){
                        g[x].remove(i);
                        break;
                    }
                }
                for(int i = 0; i < g[y].size(); i++){
                    if(g[y].get(i)==x){
                        g[y].remove(i);
                        break;
                    }
                }
            } else if (s.equals("n")){
                x = Integer.parseInt(br.readLine());
                System.out.println(g[x].size());
            } else if (s.equals("f")){
                x = Integer.parseInt(br.readLine());
                for(int i = 0; i < g[x].size(); i++){
                    friends.add(g[x].get(i));
                }
                for(int i = 0; i < friends.size(); i++){
                    for(int k = 0; k < g[friends.get(i)].size(); k++){
                        z.add(g[friends.get(i)].get(k));
                    }
                }
                z.remove(x);
                for(int i = 0; i < friends.size(); i++){
                    if(z.contains(friends.get(i)))z.remove(friends.get(i));
                }
                System.out.println(z.size());
                friends.clear();
                z.clear();
            } else if (s.equals("s")){
                boolean [] visited = new boolean[51];
                int [] dis = new int[51];
                x = Integer.parseInt(br.readLine());
                y = Integer.parseInt(br.readLine());
                q.add(x);
                visited[x]=true;
                while(!q.isEmpty()){
                    e=q.remove();
                    for(int i = 0; i < g[e].size(); i++){
                        if(!visited[g[e].get(i)]){
                            q.add(g[e].get(i));
                            visited[g[e].get(i)]=true;
                            dis[g[e].get(i)] = dis[e]+1;
                        }
                    }
                }
                if(dis[y]==0){
                    System.out.println("Not connected");
                } else {
                    System.out.println(dis[y]);
                }
                q.clear();
            } else if (s.equals("q")){
                break;
            }
        }
    }
}
