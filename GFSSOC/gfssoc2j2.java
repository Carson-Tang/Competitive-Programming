import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        int a = 1;
        int b = 1;
        for(int i = 0; i < n; i++) {
            if(a%7==0 && a%13==0){
                System.out.print("Fizz Fuzz");
            } else if(a%13==0) {
                System.out.print("Fuzz");
            } else if (a%7==0){
                System.out.print("Fizz");
            } else {
                System.out.print(a);
            }
            System.out.print(" ");
            if(b%7==0 && b%13==0){
                System.out.print("Fizz Fuzz");
            } else if(b%13==0) {
                System.out.print("Fuzz");
            } else if (b%7==0){
                System.out.print("Fizz");
            } else {
                System.out.print(b);
            }
            System.out.println("");
            a++;
            b+=2;
        }
    }
}
