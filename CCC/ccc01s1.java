import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        int c=0;
        int p =0;
        System.out.println("Cards Dealt              Points");
        int t=0;
        for(int i =0; i < s.length(); i++){
            if(s.charAt(i)=='C') {
                System.out.print("Clubs ");
                for(int k = i+1; s.charAt(k)!='D'; k++){
                    System.out.print(s.charAt(k) + " ");
                    c++;
                    if(s.charAt(k)=='A'){
                        p += 4;
                    } else if (s.charAt(k)=='K'){
                        p+= 3;
                    } else if (s.charAt(k)=='Q'){
                        p+= 2;
                    }else if (s.charAt(k)=='J'){
                        p+= 1;
                    }
                }
                if(c==0){
                    p += 3;
                } else if (c==1){
                    p += 2;
                } else if (c==2){
                    p +=1;
                }
                System.out.print(" " + p);
                t+=p;
                p=0;
                c=0;
                System.out.println("");
            } else if(s.charAt(i)=='D') {
                System.out.print("Diamonds ");
                for(int k = i+1; s.charAt(k)!='H'; k++){
                    System.out.print(s.charAt(k) + " ");
                    c++;
                    if(s.charAt(k)=='A'){
                        p += 4;
                    } else if (s.charAt(k)=='K'){
                        p+= 3;
                    } else if (s.charAt(k)=='Q'){
                        p+= 2;
                    }else if (s.charAt(k)=='J'){
                        p+= 1;
                    }
                }
                if(c==0){
                    p += 3;
                } else if (c==1){
                    p += 2;
                } else if (c==2){
                    p +=1;
                }
                System.out.print(" " + p);
                t+=p;
                p=0;
                c=0;
                System.out.println("");
            } else if(s.charAt(i)=='H') {
                System.out.print("Hearts ");
                for(int k = i+1; s.charAt(k)!='S'; k++){
                    System.out.print(s.charAt(k) + " ");
                    c++;
                    if(s.charAt(k)=='A'){
                        p += 4;
                    } else if (s.charAt(k)=='K'){
                        p+= 3;
                    } else if (s.charAt(k)=='Q'){
                        p+= 2;
                    }else if (s.charAt(k)=='J'){
                        p+= 1;
                    }
                }
                if(c==0){
                    p += 3;
                } else if (c==1){
                    p += 2;
                } else if (c==2){
                    p +=1;
                }
                System.out.print(" " + p);
                t+=p;
                p=0;
                c=0;
                System.out.println("");
            } else if(s.charAt(i)=='S') {
                System.out.print("Spades ");
                for(int k = i+1; k < s.length(); k++){
                    System.out.print(s.charAt(k) + " ");
                    c++;
                    if(s.charAt(k)=='A'){
                        p += 4;
                    } else if (s.charAt(k)=='K'){
                        p+= 3;
                    } else if (s.charAt(k)=='Q'){
                        p+= 2;
                    }else if (s.charAt(k)=='J'){
                        p+= 1;
                    }
                }
                if(c==0){
                    p += 3;
                } else if (c==1){
                    p += 2;
                } else if (c==2){
                    p +=1;
                }
                System.out.print(" " + p);
                t+=p;
                p=0;
                c=0;
                System.out.println("");
            }

        }
        System.out.println("Total " + t);
    }
}
