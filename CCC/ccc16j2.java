import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        Integer [] x = new Integer[16];
        for(int i = 0; i < 16; i++) {
            x[i] = sc.nextInt();
        }
        int row = x[0] + x[1] + x[2] + x[3];

        for(int k = 4; k < 12; k+=4) {
            if(x[k] + x[k+1] + x[k+2] + x[k+3]!=row){
                System.out.println("not magic");
                return;
            }
        }
        int col = x[0] + x[4] + x[8] + x[12];
        for(int j = 1; j < 4; j++) {
            if(x[j] + x[j+4] + x[j+8] + x[j+12]!=col){
                System.out.println("not magic");
                return;
            }
        }
        System.out.println("magic");
    }
}
