import java.io.*;
import java.util.*;

public class Main {
    static int m,n;
    static String [] a,b;
    static boolean flag = false;
    static void solve(String aa, String bb, String ans){
        if(aa.length()!=0&&bb.length()!=0&&aa.equals(bb)){
            flag=true;
            System.out.println(ans.length());
            for(int i = 0; i < ans.length(); i++) System.out.println(ans.charAt(i));
            return;
        }
        if(ans.length()<m-1&&!flag) {
            for (int i = 1; i <= n; i++) {
                String t1 = aa + a[i];
                String t2 = bb + b[i];
                if (t1.startsWith(t2) || t2.startsWith(t1)) {
                    solve(t1, t2, ans + Integer.toString(i));
                }
            }
        }
    }
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());
        a = new String[41];
        b = new String[41];
        for(int i = 1; i <= n; i++) a[i]=br.readLine();
        for(int i = 1; i <= n; i++) b[i]=br.readLine();
        String s1 = "", s2 = "", ans = "";
        solve(s1,s2,ans);
        if(!flag) System.out.println("No solution.");
    }
}
