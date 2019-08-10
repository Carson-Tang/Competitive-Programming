import java.io.*;
import java.util.*;

public class Main {
    static boolean allMatch(boolean [] match){
        for(int i = 0; i < match.length; i++){
            if(!match[i]) return false;
        } return true;
    }
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 10;
        while(tc-->0){
            String [] tok = br.readLine().split(" ");
            int n = Integer.parseInt(tok[0]), x = Integer.parseInt(tok[1]), y = Integer.parseInt(tok[2]), z = Integer.parseInt(tok[3]);
            String [] test = new String[n];
            for(int i = 0; i < n; i++){
                test[i]=br.readLine();
                String ans = "";
                for(int j = 0; j < test[i].length(); j++){
                    if(test[i].charAt(j)=='0') ans+=Integer.toString(z);
                    else if(test[i].charAt(j)%2==0){
                        ans += Integer.toString(test[i].charAt(j)-48+x);
                    } else {
                        ans += Integer.toString(Math.max(0,test[i].charAt(j)-48-y));
                    }
                }
                test[i]=ans;
            }
            boolean [] match = new boolean[n];
            String buf = br.readLine();
            for(int i = 0; i < n; i++){
                String check = br.readLine();
                if(check.equals(test[i])) match[i]=true;
            }
            buf = br.readLine();
            if(allMatch(match)){
                System.out.println("MATCH");
            } else {
                String s = "";
                for(int i = 0; i < n; i++){
                    if(!match[i]) s+=Integer.toString((i+1))+",";
                }
                System.out.println("FAIL: "+s.substring(0,s.length()-1));
            }

        }
    }
}
