import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s1,s2,s3,s4;
        for(int i =0; i< n; i++){
            s1 = br.readLine();
            s2 = br.readLine();
            s3 = br.readLine();
            s4 = br.readLine();
            s1 = s1.toLowerCase();
            s2 = s2.toLowerCase();
            s3 = s3.toLowerCase();
            s4 = s4.toLowerCase();
            if(lastS(s1).equals(lastS(s2)) && lastS(s2).equals(lastS(s3)) && lastS(s3).equals(lastS(s4))){
                System.out.println("perfect");
            } else if (lastS(s1).equals(lastS(s2)) && lastS(s3).equals(lastS(s4))){
                System.out.println("even");
            } else if (lastS(s1).equals(lastS(s3)) && lastS(s2).equals(lastS(s4))){
                System.out.println("cross");
            } else if (lastS(s1).equals(lastS(s4)) && lastS(s2).equals(lastS(s3))){
                System.out.println("shell");
            } else {
                System.out.println("free");
            }
        }
    }
    public static String lastS(String s){
        String [] tok = s.split(" ");
        s = tok[tok.length-1];
        String f;
        String v = "aeiou";
        int index = -1;
        for(int i = 0; i < v.length(); i++){
            index = Math.max(index,s.lastIndexOf(v.charAt(i)));
        }

        if(index==-1){
            return tok[tok.length-1];
        } else {
            f = s.substring(index, s.length());
        }
        return f;
    }
}
