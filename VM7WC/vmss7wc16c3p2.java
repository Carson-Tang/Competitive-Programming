import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]);
        int m = Integer.parseInt(tok[1]);
        int start = Integer.parseInt(tok[2]);
        int end = Integer.parseInt(tok[3]);
        int [][] adjmat = new int[n+1][n+1];
        for(int i = 0; i< m; i++){
            String [] t = br.readLine().split(" ");
            int from = Integer.parseInt(t[0]);
            int to = Integer.parseInt(t[1]);
            adjmat[to][from] = 1;
            adjmat[from][to] = 1;
        }
        if(connected(n,start,end,adjmat)){
            System.out.println("GO SHAHIR!");
        } else {
            System.out.println("NO SHAHIR!");
        }
    }
    public static boolean connected(int n,int start,int end, int [][]adjmat ){
        boolean [] visited = new boolean[n+1];
        visited[start] = true;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(start);
        int i, element;

        while(!queue.isEmpty()){
            element = queue.remove();
            i = 0;
            while(i <= n){
                if(adjmat[element][i]==1 && !visited[i]){
                    queue.add(i);
                    visited[i] = true;
                }
                i++;
            }
        }
        if(visited[end]==true){
            return true;
        }
        return false;
    }
}
