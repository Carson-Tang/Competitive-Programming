import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cipher = br.readLine();
        String key = br.readLine();
        String f = "";
        for(int i = 0; i < cipher.length(); i++){
            int cipherindex = alpha.indexOf(cipher.charAt(i));
            int keyshift = alpha.indexOf(key.charAt(i));
            int shift = cipherindex-keyshift;
            if(shift<0) shift+=26;
            f+=alpha.charAt(shift);
            key+=alpha.charAt(shift);
        }
        System.out.println(f);
    }
}
