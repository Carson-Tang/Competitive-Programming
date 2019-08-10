import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String,String>whosmum = new HashMap<>();
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            whosmum.put(tok[1],tok[0]);
        }
        for(int i = 0; i < 10; i++){
            int cuz=-1,sis=-1;
            String s = br.readLine();
            String mum = whosmum.get(s);
            for(String a : whosmum.keySet()){
                if(whosmum.get(a)!=null){
                    if(whosmum.get(a).equals(mum)){
                        sis++;
                    }
                }
            }
            String mum2 = whosmum.get(mum);
            for(String a : whosmum.keySet()){
                if(whosmum.get(whosmum.get(a))!=null){
                    if(whosmum.get(whosmum.get(a)).equals(mum2)){
                        cuz++;
                    }
                }
            }
            System.out.println("Cousins: " + (cuz-sis) + ", Sisters: " + sis);
        }
    }
}
