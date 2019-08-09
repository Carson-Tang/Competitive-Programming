import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s;
        Map<String, Integer> x = new HashMap<>();
        int c = 1;
        for(int i = 0; i < n; i++){
            while(true){
                s = br.readLine();
                if(s.equals("")){
                    break;
                }
                String [] tok = s.split(" ");
                for(int k = 0; k < tok.length; k++){
                    if(x.get(tok[k])==null){
                        System.out.print(tok[k] + " ");
                        x.put(tok[k],c);
                        c++;
                    } else {
                        System.out.print(x.get(tok[k])+" ");
                    }
                }
                System.out.println();
            }
            c=1;
            x.clear();
        }
    }
}
