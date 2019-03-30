import java.io.*;
import java.util.*;

public class Main {
    public static int c =0;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int g = Integer.parseInt(br.readLine());
        int p = Integer.parseInt(br.readLine());
        int [] parent = new int[g+1];
        for(int i = 1; i <= g; i++) {
            parent[i] = i;
        }
        for(int i = 0; i < p; i++){
            int dg = Integer.parseInt(br.readLine());
            if(Find(dg,parent)==0){
                System.out.println(c);
                return;
            }
            Union(Find(dg,parent),Find(dg,parent)-1,parent);
            c++;
        }
        System.out.println(c);
    }
    public static int Find(int v, int [] parent){
        if(parent[v]!=v){
            parent[v] = Find(parent[v],parent);
        }
        return parent[v];
    }
    public static void Union(int a, int b, int [] parent) {
        parent[Find(a,parent)] = Find(b,parent);
    }
}
