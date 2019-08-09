import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] x = new int[n];
        int [] y = new int[n];
        ArrayList<Integer> area = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String [] tok =br.readLine().split(" ");
            x[i] = Integer.parseInt(tok[0]);
            y[i] = Integer.parseInt(tok[1]);
        }
        for(int i =0; i < n; i++){
            for(int k = 0; k < n; k++){
                if(i!=k){
                   if(Math.abs(x[i] - x[k]) > Math.abs(y[i] - y[k])){
                       area.add((x[i]-x[k])*(x[i]-x[k]));
                    } else {
                       area.add((y[i]-y[k])*(y[i]-y[k]));
                   }
                }
            }
        }
        Collections.sort(area);
        System.out.println(area.get(0));
    }
}
