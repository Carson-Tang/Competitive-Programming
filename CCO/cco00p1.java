import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> [] graph = new ArrayList[27];
        ArrayList<String> [] y = new ArrayList[27];
        String cap = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i = 0; i < 27; i++){
            graph[i] = new ArrayList<>();
            y[i] = new ArrayList<>();
        }
        boolean [] out = new boolean[27];
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            if(Character.isLowerCase(tok[2].charAt(0))){
                if(!y[cap.indexOf(tok[0])].contains(tok[2])) {
                    y[cap.indexOf(tok[0])].add(tok[2]);
                }
            } else {
                graph[cap.indexOf(tok[0])].add(cap.indexOf(tok[2]));
                out[cap.indexOf(tok[0])]=true;
                out[cap.indexOf(tok[2])]=true;
            }
        }
        String f;
        for(int i = 0; i < 27; i++){
            f="";
            if(out[i]) {
                f += cap.charAt(i);
                f += " = {";

                LinkedList<Integer> q = new LinkedList<>();
                q.add(i);
                boolean[] vis = new boolean[27];
                while (!q.isEmpty()) {
                    int e = q.poll();
                    vis[e] = true;
                    for (int k = 0; k < y[e].size(); k++) {
                        if (!y[i].contains(y[e].get(k))) {
                            y[i].add(y[e].get(k));
                        }
                    }
                    for (int k = 0; k < graph[e].size(); k++) {
                        if (!vis[graph[e].get(k)]) {
                            vis[graph[e].get(k)] = true;
                            q.add(graph[e].get(k));
                        }
                    }
                }
                Collections.sort(y[i]);
                for (int k = 0; k < y[i].size(); k++) {
                    f += y[i].get(k);
                    if (y[i].size() != 1 && k != y[i].size() - 1) {
                        f += ",";
                    }
                }
                f += "}";
                System.out.println(f);
            }
        }
    }
}
