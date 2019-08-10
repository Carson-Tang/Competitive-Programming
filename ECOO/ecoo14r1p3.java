import java.io.*;
import java.util.*;

public class Main {
    static char [][] g;
    static boolean [][] marked;
    static int r,c;
    static boolean found = false;
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = 5;
        while (tc-- > 0) {
            String[] tok = br.readLine().split(" ");
            r = Integer.parseInt(tok[0]);
            c = Integer.parseInt(tok[1]);
            g = new char[r][c];
            marked = new boolean[r][c];
            for (int i = 0; i < r; i++) {
                String s = br.readLine();
                for (int j = 0; j < c; j++) {
                    g[i][j] = s.charAt(j);
                }
            }
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String next = br.readLine();
                String find = "";
                String rev = "";
                for (int j = 0; j < next.length(); j++) {
                    if (Character.isLetter(next.charAt(j))) {
                        find += next.charAt(j);
                    }
                }
                for (int j = find.length() - 1; j >= 0; j--) rev += find.charAt(j);
                found = false;
                for (int j = 0; j < r && !found; j++) {
                    for (int k = 0; k < c && !found; k++) {
                        if (hzfw(find, j, k)) continue;
                        if (hzfw(rev, j, k)) continue;
                        if (vtfw(find, j, k)) continue;
                        if (vtfw(rev, j, k)) continue;
                        if (dgleft(find, j, k)) continue;
                        if (dgleft(rev, j, k)) continue;
                        if (dgright(rev, j, k)) continue;
                        dgright(find, j, k);
                    }
                }
                if (!found) {
                    System.out.println(find);
                    System.out.println("RIP");
                }
            }
            String ans = "";
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (!marked[i][j]) {
                        ans += g[i][j];
                    }
                }
            }
            System.out.println(ans);
        }
    }
    public static boolean vtfw(String s, int ii, int jj){
        int idx = 0;
        String curr = "";
        int i = ii;
        while(i<r&&idx<s.length()){
            if(g[i][jj]==s.charAt(idx)){
                curr+=g[i][jj];
                idx++;
            } else break;
            i++;
        }
        if(curr.equals(s)){
            for(int j = ii; j < ii+s.length(); j++){
                marked[j][jj]=true;
            }
            found=true;
            return true;
        } return false;
    }
    public static boolean dgright(String s, int ii, int jj){
        int idx = 0;
        String curr = "";
        int i = ii, j = jj;
        while(idx<s.length()&&i<r&&j<c){
            if(g[i][j]==s.charAt(idx)){
                idx++;
                curr+=g[i][j];
            } else break;
            i++; j++;
        }
        if(curr.equals(s)){
            int cnt = s.length();
            i = ii; j = jj;
            while(cnt-->0){
                marked[i][j]=true;
                i++; j++;
            }
            found=true;
            return true;
        } return false;
    }
    public static boolean dgleft(String s, int ii, int jj){
        int idx = 0;
        String curr = "";
        int i = ii, j = jj;
        while(idx<s.length()&&i<r&&j>=0){
            if(g[i][j]==s.charAt(idx)){
                idx++;
                curr+=g[i][j];
            } else break;
            i++; j--;
        }
        if(curr.equals(s)){
            int cnt = s.length();
            i = ii; j = jj;
            while(cnt-->0){
                marked[i][j]=true;
                i++; j--;
            }
            found=true;
            return true;
        } return false;
    }
    public static boolean hzfw(String s, int ii, int jj){
        int idx = 0;
        String curr = "";
        int j = jj;
        while(j<c&&idx<s.length()){
            if(g[ii][j]==s.charAt(idx)){
                curr+=g[ii][j];
                idx++;
            } else break;
            j++;
        }
        if(curr.equals(s)){
            for(int i = jj; i < jj+s.length(); i++){
                marked[ii][i]=true;
            }
            found=true;
            return true;
        } return false;
    }
}
