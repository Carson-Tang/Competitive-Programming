import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Integer [] x = new Integer[5];
        ArrayList<Integer> y = new ArrayList<>();
        int c =0;
        for(int i = 0; i < 5; i++){
            x[i] = sc.nextInt();
        }
        for(int i = 0; i <= x[4]; i++){
            for(int k = 0; k <= x[4]; k++) {
                for(int j = 0; j <= x[4]; j++) {
                    for(int e = 0; e <= x[4]; e++) {
                        if(i*x[0] + j*x[2] + k*x[1] + e*x[3] ==x[4]) {
                            System.out.println("# of PINK is "+i+" # of GREEN is "+k+" # of RED is "+ j+ " # of ORANGE is " + e);
                            c++;
                            y.add(i+k+j+e);
                        }
                    }
                }
            }
        }
        Collections.sort(y);
        System.out.println("Total combinations is " + c + ".");
        System.out.println("Minimum number of tickets to print is " +y.get(0)+ ".");
    }
}
