import java.io.*;
import java.util.*;

public class Main {
    static boolean aneg,bneg;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String [] tok = br.readLine().split(" ");
            String a = tok[0], b = tok[1];
            aneg = false;
            bneg = false;
            if(a.charAt(0)=='-'){
                aneg=true;
                a = a.substring(1,a.length());
            }
            if(b.charAt(0)=='-'){
                bneg=true;
                b = b.substring(1,b.length());
            }
            // both pos or both neg
            if((!aneg && !bneg) || (aneg && bneg)){
                add(a,b);
            } else {
                findMax(a,b);
            }
            System.out.println();
        }
    }
    public static void sub(String a, String b){
        if(a.equals(b)){
            System.out.println(0);
            return;
        }
        int length = Math.max(a.length(),b.length()) + 1;
        int [] first = new int[length];
        int [] second = new int[length];
        int [] third = new int[length];
        for(int i = a.length()-1, k = length-1; i>=0; i--, k--){
            first[k] = Character.getNumericValue(a.charAt(i));
        }
        for(int i = b.length()-1, k = length-1; i>=0; i--, k--){
            second[k] = Character.getNumericValue(b.charAt(i));
        }
        for(int i = length-1; i >= 0; i--){
            int sum = first[i] - second[i];
            if(sum<0){
                sum+=10;
                first[i-1]--;
            }
            third[i] = sum;
        }
        boolean flag=false;
        for(int i= 0; i < third.length; i++){
            if(!flag){
                if(third[i]!=0){
                    flag=true;
                }
            }
            if(flag){
                System.out.print(third[i]);
            }
        }
    }
    public static void findMax(String a, String b){
        if(a.length()>b.length()){
            if(aneg) System.out.print("-");
            sub(a,b);
        } else if (b.length()>a.length()){
            if(bneg) System.out.print("-");
            sub(b,a);
        } else {
            for(int i = 0; i < a.length(); i++){
                if(Character.getNumericValue(a.charAt(i))>Character.getNumericValue(b.charAt(i))){
                    if(aneg) System.out.print("-");
                    sub(a,b);
                    return;
                } else if (Character.getNumericValue(a.charAt(i))<Character.getNumericValue(b.charAt(i))){
                    if(bneg) System.out.print("-");
                    sub(b,a);
                    return;
                }
            }
            sub(a,b);
        }
    }
    public static void add (String a, String b){
        int length = Math.max(a.length(),b.length()) + 1;
        int [] first = new int[length];
        int [] second = new int[length];
        int [] third = new int[length];
        for(int i = a.length()-1, k = length-1; i>=0; i--, k--){
            first[k] = Character.getNumericValue(a.charAt(i));
        }
        for(int i = b.length()-1, k = length-1; i>=0; i--, k--){
            second[k] = Character.getNumericValue(b.charAt(i));
        }
        for(int i = length-1; i >= 0; i--){
            int sum = first[i] + second[i];
            if(sum>=10){
                sum-=10;
                first[i-1]++;
            }
            third[i]=sum;
        }
        if(aneg){
            System.out.print("-");
        }
        boolean flag=false;
        for(int i= 0; i < third.length; i++){
            if(!flag){
                if(third[i]!=0){
                    flag=true;
                }
            }
            if(flag){
                System.out.print(third[i]);
            }
        }
        if(!flag) System.out.println(0);
    }
}
