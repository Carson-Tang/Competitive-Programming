import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> franchises = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            String [] t = br.readLine().split(" ");
            int c = 0;
            int w = 0;
            for(int k = 0; k < Integer.parseInt(t[1]); k++){
                String [] tok =br.readLine().split(" ");
                for(int j = 0; j < Integer.parseInt(t[0]); j++){
                    w += Integer.parseInt(tok[j]);
                    if(k==0){
                        franchises.add(Integer.parseInt(tok[j]));
                    } else {
                        franchises.set(j, franchises.get(j)+Integer.parseInt(tok[j]));
                    }
                }
                if(w%13==0){
                    c+=w/13;
                }
                w=0;
            }
            for(int a : franchises){
                if(a%13==0){
                    c+=a/13;
                }
            }
            franchises.clear();
            System.out.println(c);
        }
    }
}
