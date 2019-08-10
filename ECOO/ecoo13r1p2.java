import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        for(int i = 0; i < 5; i++){
            String [] tok = br.readLine().split(" ");
            for(int k = 0; k < 5; k++){
                t=0;
                if(tok[k].length()==1){
                    if(!tok[k].equals("0")){
                        System.out.print(10 - num(Integer.parseInt(tok[k])));
                    } else {
                        System.out.print(0);
                    }
                } else {
                    for(int j = tok[k].length()-1; j >= 0; j-=2){
                        t += num(Integer.parseInt(Character.toString(tok[k].charAt(j))));
                        t %= 10;
                    }
                    for(int j = tok[k].length()-2; j >= 0; j-=2){
                        t += Integer.parseInt(Character.toString(tok[k].charAt(j)));
                        t %= 10;
                    }
                    if(t==0){
                        System.out.print(0);
                    } else {
                        System.out.print(10 - t);
                    }
                }
            }
            System.out.println();
        }
    }
    public static int num(int n){
        if(n<=4){
            return n*2;
        } else if (n==5){
            return 1;
        } else if (n==6){
            return 3;
        } else if (n==7){
            return 5;
        } else if (n==8){
            return 7;
        } else if (n==9){
            return 9;
        }
        return n*2;
    }
}
