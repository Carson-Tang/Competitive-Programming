import java.io.*;
import java.util.*;

public class Main {
public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String t = sc.readLine();
        String f,f1;
        if(t.length()>=3) {
            f = t.substring(0, t.length() - 2);
            f1 = t.substring(t.length() - 2, t.length());
        } else {
            f = "0";
            f1=t.substring(t.length()-2,t.length());
        }
        String a = Integer.toString(Integer.parseInt(f)%24);
        String b=f1;
        if(Integer.parseInt(b)!=0) {
            b = Integer.toString(Integer.parseInt(f1) % 60);
        } else {
            b=f1;
        }
        if(Integer.parseInt(a)==0){
            System.out.println(b + " in Ottawa");
        }else {
            System.out.println(a + b + " in Ottawa");
        }
        a = f;
        a = Integer.toString(Integer.parseInt(a)+21);
        a = Integer.toString(Integer.parseInt(a)%24);
        if(Integer.parseInt(a)==0){
            System.out.println(b + " in Victoria");
        }else {
            System.out.println(a + b + " in Victoria");
        }
        a=f;
        a = Integer.toString(Integer.parseInt(a)+22);
        a = Integer.toString(Integer.parseInt(a)%24);
        if(Integer.parseInt(a)==0){
            System.out.println(b + " in Edmonton");
        }else {
            System.out.println(a + b + " in Edmonton");
        }
        a=f;
        a = Integer.toString(Integer.parseInt(a)+23);
        a = Integer.toString(Integer.parseInt(a)%24);
        if(Integer.parseInt(a)==0){
            System.out.println(b + " in Winnipeg");
        }else {
            System.out.println(a + b + " in Winnipeg");
        }
        a=f;
        if(Integer.parseInt(a)==0){
            System.out.println(b + " in Toronto");
        }else {
            System.out.println(a + b + " in Toronto");
        }
        a = Integer.toString(Integer.parseInt(a)+1);
        a = Integer.toString(Integer.parseInt(a)%24);
        if(Integer.parseInt(a)==0){
            System.out.println(b + " in Halifax");
        }else {
            System.out.println(a + b + " in Halifax");
        }
        a=f;
        a = Integer.toString(Integer.parseInt(a)+1);
        a = Integer.toString(Integer.parseInt(a)%24);
        b = Integer.toString(Integer.parseInt(b)+30);
        if(Integer.parseInt(b)>=60){
            a = Integer.toString(Integer.parseInt(a) + 1);
            if(Integer.parseInt(a)==24){
                a = Integer.toString(0);
            }
            b = Integer.toString(Integer.parseInt(b)%60);
        }
        if(Integer.parseInt(a)==0){
            System.out.println(b + " in St. John's");
        }else {
            System.out.println(a + b + " in St. John's");
        }
    }
}
