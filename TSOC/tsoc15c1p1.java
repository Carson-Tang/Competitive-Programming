import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(sc.readLine());
        Map<String, Integer> x = new HashMap<>();
        x.put("Cl",1);
        x.put("Br",1);
        x.put("Xe",1);
        x.put("Kr",1);
        x.put("Si",1);
        x.put("As",1);
        x.put("Rn",1);
        x.put("Ne",1);
        x.put("He",1);
        x.put("H",1);
        x.put("C",1);
        x.put("N",1);
        x.put("O",1);
        x.put("F",1);
        x.put("P",1);
        x.put("S",1);
        x.put("I",1);
        boolean b = false;
        for(int i = 0; i < a; i++) {
            String[] tokens = sc.readLine().split(" ");
            for(int k =0; k < tokens.length; k++) {
                if(x.get(tokens[k])==null){
                    b=true;
                }
            }
            if(!b){
                System.out.println("Molecular!");
            } else {
                System.out.println("Not molecular!");
            }
            b=false;
        }
    }
}
