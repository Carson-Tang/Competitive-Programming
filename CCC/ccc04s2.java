import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        int n = Integer.parseInt(tok[0]), k = Integer.parseInt(tok[1]);
        int [] rank = new int[n];
        int [] score = new int[n];
        int c;
        for(int i = 0; i < k; i++){
            String [] t = br.readLine().split(" ");
            for(int j = 0; j < n; j++){
                score[j] += Integer.parseInt(t[j]);
            }
            for(int j = 0; j < n; j++){
                c=0;
                for(int e = 0; e < n; e++){
                    if (j!=e) {
                        if(score[j]<score[e]){
                            c++;
                        }
                    }
                }
                if(rank[j]<c+1){
                    rank[j]=c+1;
                }
            }
        }
        int max = Integer.MAX_VALUE * -1;
        for(int i = 0; i < n; i++){
            if(score[i]>max){
                max=score[i];
            }
        }
        for(int i = 0; i < n; i++) {
            if(score[i]==max) {
                System.out.println("Yodeller " + (i + 1) + " is the TopYodeller: score " + max + ", worst rank " + rank[i]);
            }
        }
    }
}
