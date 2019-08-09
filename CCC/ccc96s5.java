import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        for(int i = 0; i < d; i++){
            int n = Integer.parseInt(br.readLine());
            String [] tok = br.readLine().split(" ");
            String [] tok2 = br.readLine().split(" ");
            int max = 0;
            for(int k = 0; k < n; k++){
                for(int j = 0; j < n; j++){
                    if(tok[k].equals(tok2[j])) {
                        if (j >= k && j - k >= max){
                            max = j - k;
                        }
                    }
                }
            }
            System.out.println("The maximum distance is " + max);
        }
    }
}
