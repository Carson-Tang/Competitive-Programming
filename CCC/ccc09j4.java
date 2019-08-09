import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] tok = {"WELCOME","TO","CCC","GOOD","LUCK","TODAY"};
        String s = "";
        int wordcount=0;
        for(int i = 0; i < 6; i++){
            if(canAdd(n,s,tok[i])){
                if(s.isEmpty()){
                    s+=tok[i];
                } else {
                    s+='.';
                    s+=tok[i];
                }
                wordcount++;
            } else {
                s = spacing(n,s,wordcount);
                System.out.println(s);
                wordcount=0;
                s="";
                i--;
            }
        }
        String [] t = s.split("\\.");
        if(t.length==1) {
            wordcount=1;
        } else {
            wordcount=0;
        }
        if(!s.isEmpty()) {
            s = spacing(n,s,wordcount);
            System.out.println(s);
        }
    }
    public static String spacing(int n, String s, int wordcount){
        if(wordcount==1){
            while(s.length()!=n){
                s+='.';
            }
            return s;
        }
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i)=='.' && s.charAt(i-1)!='.' && s.length()<n){
                s = s.substring(0,i+1) + "." + s.substring(i+1);
                i++;
            }
        }
        if(s.length()==n) return s;
        return spacing(n,s,wordcount);
    }
    public static boolean canAdd(int n, String s, String add){
        if(s.isEmpty()) return true;
        if(s.length() + add.length() + 1 <= n) return true;
        return false;
    }
}
