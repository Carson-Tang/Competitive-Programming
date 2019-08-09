import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(true){
            s = br.readLine();
            if(s.equals("X")){
                return;
            }
            for(int i = 0; i < 5; i++){
                s = s.replace("ANA","A");
                s = s.replace("BAS","A");
            }
            if(s.equals("A")){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
