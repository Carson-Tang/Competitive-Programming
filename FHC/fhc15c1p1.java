import java.io.*;
import java.util.*;

public class Main {
    static int cnt = 0;
    static boolean flag = true;
    static class node {
        Map<Character,node> child = new HashMap<>();
        public void insert(int ind, char [] c){
            if(ind<c.length){
                if(flag) cnt++;
                if(child.get(c[ind])==null){
                    child.put(c[ind],new node());
                    flag=false;
                }
                child.get(c[ind]).insert(ind+1,c);
            }
        }
    }
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int tc = 0; tc < t; tc++) {
            int n = Integer.parseInt(br.readLine());
            node root = new node();
            for (int i = 0; i < n; i++) {
                String s = br.readLine();
                flag = true;
                char[] c = s.toCharArray();
                root.insert(0, c);
            }
            System.out.println("Case #"+(tc+1)+": "+cnt);
            cnt = 0;
        }
    }
}
