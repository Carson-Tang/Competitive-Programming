import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        ArrayList<Character> x = new ArrayList<>();
        int c = 0,d=0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)!='X' && c==0){
                x.add(s.charAt(i));
                c=0;
                d++;
            } else if(s.charAt(i)!='X' && c!=0){
                x.set(d-c,s.charAt(i));
                c=0;
            } else {
                c++;
            }
        }
        String z;
        for(int i = 0; i < n; i++){
            z = br.readLine();
            if(x.get(i)=='A'){
                System.out.println("Dear "+z+", beloved artist, I would love to have you at my party. Come to my crib on April 20th.");
            } else if (x.get(i)=='O'){
                System.out.println("Dear "+z+", beloved occasion enthusiast, come to my crib to celebrate this very special day.");
            } else {
                System.out.println("Dear "+z+", April 20th is happening again this year. Don't miss out.");
            }
        }
    }
}
