import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] repTo = new int[101];
        int [] sent = new int[101];
        int [] rec = new int[101];
        int time = 0;
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            char x = tok[0].charAt(0);
            int t = Integer.parseInt(tok[1]);
            if(x=='R'){
                repTo[t]=-1;
                rec[t]=time;
            } else if (x=='S'){
                repTo[t]=1;
                sent[t]+=(time - rec[t]);
            } else if (x=='W'){
                time+=(t-2);
            }
            time++;
        }
        for(int i = 0; i < 101; i++){
            if(repTo[i]>0){
                System.out.println(i + " " + sent[i]);
            } else if(repTo[i]==-1){
                System.out.println(i + " " + -1);
            }
        }
    }
}
