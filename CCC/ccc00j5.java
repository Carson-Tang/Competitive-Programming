import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s, f="",z;
        ArrayList<Integer> [] y = new ArrayList[101];
        for(int i = 0; i < 101; i++){
            y[i]= new ArrayList<>();
        }
        char c;
        Map<String, Integer> x = new HashMap<>();
        for(int i = 0; i < n; i++){
            s=br.readLine();
            if(x.get(s)==null){
                x.put(s,x.size());
            }
            z=br.readLine();
            while(!z.contains("</HTML>")){
                String [] tok = z.split(" ");
                for(int k = 0; k < tok.length-1; k++){
                    if(tok[k].contains("<A") && tok[k+1].contains("HREF=")){
                        for(int j = tok[k+1].indexOf("\"")+1; j < tok[k+1].length(); j++){
                            c=tok[k+1].charAt(j);
                            if(c=='"'){
                                break;
                            } else {
                                f+=c;
                            }
                        }
                        if(x.get(f)==null){
                            x.put(f,x.size());
                        }
                        y[x.get(s)].add(x.get(f));
                        System.out.println("Link from " + s + " to " + f);
                        f="";
                    }
                }
                z=br.readLine();
            }
        }
        String start,end;
        while(true){
            start = br.readLine();
            if("The End".equals(start)){
                return;
            }
            end = br.readLine();
            bfs(y,start,end,x);
        }
    }
    public static void bfs(ArrayList<Integer>[]y, String s, String o, Map<String, Integer> x){
        int start = x.get(s);
        int end = x.get(o);
        LinkedList<Integer> q = new LinkedList<>();
        boolean [] visited = new boolean[101];
        q.add(start);
        visited[start]=true;
        int e;
        while(!q.isEmpty()){
            e=q.remove();
            for(int i = 0; i < y[e].size(); i++){
                if(!visited[y[e].get(i)]){
                    visited[y[e].get(i)]=true;
                    q.add(y[e].get(i));
                    if(y[e].get(i)==end){
                        q.clear();
                        break;
                    }
                }
            }
        }
        if(visited[end]){
            System.out.println("Can surf from " + s + " to " + o + ".");
        } else {
            System.out.println("Can't surf from " + s + " to " + o + ".");
        }
    }
}
