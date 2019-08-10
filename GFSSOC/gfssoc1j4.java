import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        char [][] x = new char [3][3];
        String q;
        String w;
        String e;

        q = sc.nextLine();
        w = sc.nextLine();
        e = sc.nextLine();

        x[0][0] = q.charAt(0);
        x[0][1] = q.charAt(1);
        x[0][2] = q.charAt(2);
        x[1][0] = w.charAt(0);
        x[1][1] = w.charAt(1);
        x[1][2] = w.charAt(2);
        x[2][0] = e.charAt(0);
        x[2][1] = e.charAt(1);
        x[2][2] = e.charAt(2);
        boolean griffy = false;
        boolean tim = false;
        if(x[0][0]==x[0][1] && x[0][1]==x[0][2]){
            if(x[0][0]=='O'){
                griffy = true;
            } else {
                tim = true;
            }
        }
        if(x[1][0]==x[1][1] && x[1][1]==x[1][2]){
            if(x[1][0]=='O'){
                griffy = true;
            } else {
                tim = true;
            }
        }
        if(x[2][0]==x[2][1] && x[2][1]==x[2][2]){
            if(x[2][2]=='O'){
                griffy = true;
            } else {
                tim = true;
            }
        }
        if(x[0][0]==x[1][0] && x[1][0]==x[2][0]){
            if(x[0][0]=='O'){
                griffy = true;
            } else {
                tim = true;
            }
        }
        if(x[0][1]==x[1][1] && x[1][1]==x[2][1]){
            if(x[0][1]=='O'){
                griffy = true;
            } else {
                tim = true;
            }
        }
        if(x[0][2]==x[1][2] && x[1][2]==x[2][2]){
            if(x[0][2]=='O'){
                griffy = true;
            } else {
                tim = true;
            }
        }
        if(x[0][0]==x[1][1] && x[1][1]==x[2][2]){
            if(x[0][0]=='O'){
                griffy = true;
            } else {
                tim = true;
            }
        }
        if(x[0][2]==x[1][1] && x[1][1]==x[2][0]){
            if(x[0][2]=='O'){
                griffy = true;
            } else {
                tim = true;
            }
        }
        int a = 0;
        int b = 0;
        if(griffy){
            a=1;
        }
        if(tim){
            b=1;
        }
        if(a==1){
            if(b==1){
                System.out.println("Error, redo");
            } else {
                System.out.println("Griffy");
            }
        } else if (b==1){
            System.out.println("Timothy");
        } else {
            System.out.println("Tie");
        }
    }
}
