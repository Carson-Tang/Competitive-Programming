import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int [] arr = new int[1000101];
        for(int i = 20; i < s.length()+20; i++) arr[i] = s.charAt(i-20)-48;
        int lb = 20, rb = s.length()+19;
        boolean carry;
        int idx = s.length()+19;
        if(arr[idx]==9){
            carry = true;
            arr[idx]=0;
            idx--;
            while(carry){
                arr[idx]++;
                if(arr[idx]>9){
                    arr[idx]=0;
                    idx--;
                } else carry=false;
            }
        } else arr[idx]++;
        for(int i = 0; i <1000101; i++){
            if(arr[i]>0){
                lb=i;
                break;
            }
        }
        while(lb<rb){
            if(arr[lb]==arr[rb]){
                lb++;
                rb--;
            } else {
                if(arr[rb]>arr[lb]){
                    carry = true;
                    arr[rb] = arr[lb];
                    idx = rb-1;
                    while(carry){
                        arr[idx]+=1;
                        if(arr[idx]>9){
                            arr[idx]=0;
                            carry=true;
                        } else carry=false;
                    }
                } else {
                    arr[rb] = arr[lb];
                }
            }
        }
        boolean flag = false;
        for(int i = 0; i < s.length()+20; i++){
            if (flag) System.out.print(arr[i]);
            else if(arr[i]>0){
                flag=true;
                System.out.print(arr[i]);
            }
        }
    }
}
