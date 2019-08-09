import java.io.*;
import java.util.*;

public class Main {
public static void main (String [] args)throws IOException{
        for(int i = 1000; i <= 9999; i++) {
            if(perfect(i)){
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("");
        for(int i = 100; i <= 999; i++) {
            if(cube(i)){
                System.out.print(i);
                System.out.print(" ");
            }
        }
    }
    public static boolean cube(int i){
        String s = Integer.toString(i);
        int f=0;
        for(int k = 0; k < s.length(); k++) {
            f += Character.getNumericValue(s.charAt(k))*Character.getNumericValue(s.charAt(k))*Character.getNumericValue(s.charAt(k));
        }
        if(i == f){
            return true;
        }
        return false;
    }
    public static boolean perfect(int i){
        int s=0;
        for(int k = 1; k < i; k++) {
            if(i%k==0){
                s+=k;
            }
            if(s>i){
                return false;
            }
        }
        if(s==i){
            return true;
        }
        return false;
    }
}
