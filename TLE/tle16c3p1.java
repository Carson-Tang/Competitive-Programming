import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Map<String, Integer> x = new HashMap<>();
        sc.nextLine();
        String s;
        String [] y = new String [t];
        for(int i = 0; i < t; i++) {
            s = sc.nextLine();
            y[i] = s;
            if(x.get(s)==null) {
                x.put(s, 1);
            } else {
                x.replace(s,-1);
            }
        }
        int f=0;
        for(int k = 0; k < t; k++){
            if(x.get(y[k])==1){
                f++;
            }
        }
        System.out.println(f);
    }
}
