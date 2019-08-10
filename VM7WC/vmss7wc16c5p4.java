import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] tok = br.readLine().split(" ");
        int [] num = new int[3];
        for(int i = 0; i< 3; i++) num[i] = Integer.parseInt(tok[i]);
        Arrays.sort(num);
        int [] value = new int[n+1];
        Arrays.fill(value,-1);
        value[0]=0;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < 3; j++){
                if(num[j]<=i){
                    int temp = value[i - num[j]];
                    if(temp != -1 && temp+1 > value[i]){
                        value[i]=temp+1;
                    }
                }
            }
        }
        System.out.println(value[n]);
    }
}
