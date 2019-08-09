import java.io.*;
import java.util.*;

public class Main {
    public static int c=0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        ArrayList<String> roads = new ArrayList<>();
        String alpha = "-ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        ArrayList<Integer> [] x = new ArrayList[27];
        for(int i =0; i< 27; i++){
            x[i] = new ArrayList<>();
        }
        int xc,yc;
        while(true){
            s = br.readLine();
            if("**".equals(s)){
                break;
            }
            roads.add(s);
            xc = alpha.indexOf(s.charAt(0));
            yc = alpha.indexOf(s.charAt(1));
            x[xc].add(yc);
            x[yc].add(xc);
        }
        for(int i = 0; i< roads.size(); i++){
            s = roads.get(i);
            xc = alpha.indexOf(s.charAt(0));
            yc = alpha.indexOf(s.charAt(1));
            for(int k = 0; k < x[xc].size(); k++){
                if(x[xc].get(k)==yc){
                    x[xc].remove(k);
                    break;
                }
            }
            for(int k =0; k < x[yc].size(); k++){
                if(x[yc].get(k)==xc){
                    x[yc].remove(k);
                    break;
                }
            }
            bfs(x,xc,yc,s);
            x[xc].add(yc);
            x[yc].add(xc);
        }
        System.out.println("There are " + c + " disconnecting roads.");
    }
    public static void bfs(ArrayList<Integer> [] x , int start, int end, String s){
        LinkedList<Integer> q = new LinkedList<>();
        int e;
        boolean [] visited = new boolean[27];
        visited[start]=true;
        q.add(start);
        while(!q.isEmpty()){
            e = q.remove();
            for(int i = 0; i < x[e].size(); i++){
                if(!visited[x[e].get(i)]){
                    visited[x[e].get(i)]=true;
                    q.add(x[e].get(i));
                }
            }
        }
        if(!visited[end]){
            c++;
            System.out.println(s);
        }
    }
}
