import java.io.*;
import java.util.*;

public class Main {
    static String alpha = "abcdefghijklmnopqrstuvwxyz";
    static String v = "aeiou";
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String f = "";

        for(int i = 0; i < s.length(); i++){
            f += s.charAt(i);
            if(!v.contains(Character.toString(s.charAt(i)))) {
                f += closestVowel(s.charAt(i));
                f += nextC(s.charAt(i));
            }
        }
        System.out.println(f);

    }
    public static char nextC(char s){
        int a;
        if(s=='z'){
            return 'z';
        }
        for(int i = alpha.indexOf(s)+1; i <= alpha.length()-1; i++){
            if(!v.contains(Character.toString(alpha.charAt(i))) && alpha.charAt(i)!=s){
                a = i;
                return alpha.charAt(a);
            }
        }
        return 'a';
    }
    public static char closestVowel(char s){
        if(s=='z'){
            return 'u';
        }
        int a =999;
        int b = 999;
        for(int i = alpha.indexOf(s)+1; i <= alpha.length()-1; i++){
            if(v.contains(Character.toString(alpha.charAt(i)))&& alpha.charAt(i)!=s){
                a=i;
                break;
            }
        }
        for(int i = alpha.indexOf(s)+1; i >= 0; i--){
            if(v.contains(Character.toString(alpha.charAt(i))) && alpha.charAt(i)!=s){
                b=i;
                break;
            }
        }
        if(a==999){
            return alpha.charAt(b);
        } else if (b==999){
            return alpha.charAt(a);
        } else if (Math.abs(alpha.indexOf(s) - a) <= Math.abs(alpha.indexOf(s)-b)){
            if(Math.abs(alpha.indexOf(s)-a)==Math.abs(alpha.indexOf(s)-b)){
                if(a>b){
                    return alpha.charAt(b);
                } else {
                    return alpha.charAt(a);
                }
            }
            return alpha.charAt(a);
        } else {
            return alpha.charAt(b);
        }
    }
}
