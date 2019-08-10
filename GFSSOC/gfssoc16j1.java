import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        String u;
        sc.nextLine();
        int p=0;
        for(int i = 0; i < c; i++) {
            u = sc.nextLine();
            if(u.equals("TOK")){
                n-=1;
                if(n>=0){
                    p++;
                }
            } else if (u.equals("English")){
                n-=2;
                if(n>=0){
                    p++;
                }
            }
            else if (u.equals("Chemistry")){
                n-=3;
                if(n>=0){
                    p++;
                }
            } else if (u.equals("Math")){
                n-=4;
                if(n>=0){
                    p++;
                }
            }
        }
        if(n>=0) {
            System.out.println("YEA BOI");
        } else {
            System.out.println("Go to Metro");
            System.out.println(p);
        }
    }
}
