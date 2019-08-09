import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String [] tokens1 = sc.readLine().split(" ");
        String [] tokens2 = sc.readLine().split(" ");
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < n; i++) {
            if(tokens1[i].equals("rock")) {
                if(tokens2[i].equals("paper")){
                    b++;
                } else if (tokens2[i].equals("scissors")) {
                    a++;
                }
            } else if (tokens1[i].equals("paper")) {
                if(tokens2[i].equals("scissors")){
                    b++;
                } else if (tokens2[i].equals("rock")){
                    a++;
                }
            } else if (tokens1[i].equals("scissors")) {
                if(tokens2[i].equals("rock")){
                    b++;
                }else if (tokens2[i].equals("paper")){
                    a++;
                }
            }
        }
        System.out.println(a + " " + b);
    }
}
