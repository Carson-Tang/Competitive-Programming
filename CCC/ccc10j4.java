import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String [] tok = br.readLine().split(" ");
            int n = Integer.parseInt(tok[0]);
            if(n==0){
                return;
            }
            int [] diff = new int[n-1];
            for(int i = 1; i < n; i++){
                diff[i-1] = Integer.parseInt(tok[i+1]) - Integer.parseInt(tok[i]);
            }
            System.out.println(len(diff,n-1));
        }
    }
    public static int len(int [] diff, int n){
        if(n<2) return n;
        int length = 1;
        while(true){
            int [] pat = new int[length];
            for(int i = 0; i < length; i++){
                pat[i] = diff[i];
            }
            int ind = 0;
            boolean flag=true;
            for(int i = length; i < n; i++, ind++){
                if(ind==length){
                    ind=0;
                }
                if(pat[ind]!=diff[i]){
                    flag=false;
                    break;
                }
            }
            if(flag){
                return length;
            }
            length++;
        }
    }
}
