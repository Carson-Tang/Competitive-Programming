import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int t;
        int c,undef,oneloss,elim;
        for(int i = 0; i < n; i++){
            oneloss=0;
            elim=0;
            t = Integer.parseInt(br.readLine());
            undef=t;
            c=0;
            System.out.println("Round " + c + ": " + undef + " undefeated, " + oneloss + " one-loss, " + elim + " eliminated");
            while(true){
                if(undef==1 && oneloss==1){
                    undef=0;
                    oneloss=2;
                } else {
                    elim += oneloss / 2;
                    oneloss -= oneloss / 2;
                    oneloss += undef / 2;
                    undef -= undef / 2;
                }
                c++;
                if(undef==0 && oneloss==1){
                    System.out.println("Round " + c + ": " + undef + " undefeated, " + oneloss + " one-loss, " + elim + " eliminated");
                    break;
                }
                System.out.println("Round " + c + ": " + undef + " undefeated, " + oneloss + " one-loss, " + elim + " eliminated");
            }
            System.out.println("There are " + c + " rounds.");
        }
    }
}
