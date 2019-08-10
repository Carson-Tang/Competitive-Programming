import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String s = sc.readLine();
        for(int i = 0; i < n; i++){
            String [] tok = sc.readLine().split("/| ");
            if(tok.length==1){
                System.out.println("Y");
            } else if (tok.length==2){
                if(Integer.parseInt(tok[0])>Integer.parseInt(tok[1])){
                    System.out.println("Y");
                } else {
                    System.out.println("N");
                }
            } else if (tok.length==3) {
                if(Integer.parseInt(tok[0])>Integer.parseInt(tok[1])){
                    if(s.contains(tok[2])){
                        System.out.println("Y");
                    } else {
                        System.out.println("N");
                    }
                } else {
                    System.out.println("N");
                }
            }
        }
    }
}
