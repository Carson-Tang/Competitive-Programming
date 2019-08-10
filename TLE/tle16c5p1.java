import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String v = "aeiou";
        int c = 0;
        String [] tok = sc.readLine().split(" ");
        for(int i = 0; i < tok.length; i++){
            if(tok[i].length()==1){
                if(!v.contains(tok[i])){
                    System.out.println("not readable");
                    return;
                }
            } else {
                for (int k = 0; k < tok[i].length(); k++) {
                    if (v.contains(Character.toString(tok[i].charAt(k)))) {
                        c++;
                    }
                }
                if(Math.abs(tok[i].length()-c*2)>1){
                    System.out.println("not readable");
                    return;
                } else {
                    c=0;
                }
            }
        }
        System.out.println("readable");
    }
}
