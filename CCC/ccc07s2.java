import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Long, String> box = new HashMap<>();
        ArrayList<Long> dimensions = new ArrayList<>();
        long v;
        int [] y = new int[3];
        int [] z = new int[3];
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            y[0] = Integer.parseInt(tok[0]);
            y[1] = Integer.parseInt(tok[1]);
            y[2] = Integer.parseInt(tok[2]);
            Arrays.sort(y);
            v = y[0]*y[1]*y[2];
            box.put(v, y[0]+"-"+y[1]+"-"+y[2]);
            dimensions.add(v);
        }
        Collections.sort(dimensions);
        int a,b,c;
        int m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++){
            String [] tok = br.readLine().split(" ");
            z[0] = Integer.parseInt(tok[0]);
            z[1] = Integer.parseInt(tok[1]);
            z[2] = Integer.parseInt(tok[2]);
            Arrays.sort(z);
            for(int k = 0; k < n; k++){
                String [] t = box.get(dimensions.get(k)).split("-");
                a=Integer.parseInt(t[0]);
                b=Integer.parseInt(t[1]);
                c=Integer.parseInt(t[2]);
                if(z[0]<=a && z[1]<=b && z[2]<=c){
                    System.out.println(dimensions.get(k).intValue());
                    break;
                }
                if(k==n-1){
                    System.out.println("Item does not fit.");
                }
            }
        }
    }
}
