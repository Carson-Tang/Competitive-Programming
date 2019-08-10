import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        Integer [] x = {1,2,3,5,8,13,21,34,55,89,144,233,377};
        int a = 0;
        String s = sc.readLine();
        if(n<1){
            System.out.println("Bruno, GO TO SLEEP");
            return;
        }
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='A'){
                if(i+1 == x[a]){
                    a++;
                } else {
                    System.out.println("Bruno, GO TO SLEEP");
                    return;
                }
            } else if (a<13){
                if(x[a]==i+1){
                    if(s.charAt(i)!='A'){
                        System.out.println("Bruno, GO TO SLEEP");
                        return;
                    }
                }
            }
        }
        System.out.println("That's quite the observation!");
    }
}
