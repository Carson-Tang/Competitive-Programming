import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        int [] laz = new int[n];
        for(int i = 0; i < n; i++){
            arr[i]=Integer.parseInt(br.readLine());
            laz[i]=arr[i];
        }
        Arrays.sort(arr);
        Arrays.sort(laz);
        long sum = 0;
        for(int i = 0; i < n;i++){
            sum += laz[i]%10007*arr[n-i-1]%10007;
            sum %= 10007;
        }
        System.out.println(sum%10007);
    }
}
