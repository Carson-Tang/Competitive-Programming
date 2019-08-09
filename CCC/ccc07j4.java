import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String p1 = br.readLine();
        String p2 = br.readLine();
        int [] char1 = new int[26];
        int [] char2 = new int[26];
        for(int i = 0; i < p1.length(); i++){
            if(p1.charAt(i)!=' '){
                char1[p1.charAt(i)-65]++;
            }
        }
        for(int i = 0; i < p2.length(); i++){
            if(p2.charAt(i)!=' '){
                char2[p2.charAt(i)-65]++;
            }
        }
        if(Arrays.equals(char1,char2)) System.out.println("Is an anagram.");
        else System.out.println("Is not an anagram.");
    }
}
