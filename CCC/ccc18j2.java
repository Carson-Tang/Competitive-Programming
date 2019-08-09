import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String a = sc.readLine();
        String b = sc.readLine();
        int c=0;
        for(int i = 0; i < n; i++){
            if((a.charAt(i)=='C')&&(b.charAt(i)=='C')){
                c++;
            }
        }
        System.out.println(c);
    }
}
