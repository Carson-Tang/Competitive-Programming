import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testcase; i++){
            int l = Integer.parseInt(br.readLine());
            String [] tok = br.readLine().split(" ");
            int [] arr = new int[l];
            for(int k = 0; k < l; k++) arr[k] = Integer.parseInt(tok[k]);
            boolean flag;
            int cnt = 0;
            do {
                flag=true;
                for(int j = l-1; j > 0; j--){
                    if(arr[j-1]>arr[j]){
                        int holder = arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=holder;
                        flag=false;
                        cnt++;
                    }
                }
            } while(!flag);
            System.out.println(cnt);
        }
    }
}
