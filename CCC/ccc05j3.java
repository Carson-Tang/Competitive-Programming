import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] x = new String[5];
        String [] y = new String[5];
        int i = 0;
        while(true) {
            x[i] = sc.readLine();
            y[i] = sc.readLine();
            if(y[i].equals("SCHOOL")){
                break;
            }
            i++;
        }
        for(int k = i; k > 0; k--) {
            if(x[k].equals("R")) {
                System.out.println("Turn LEFT onto " + y[k-1] + " street.");
            } else if (x[k].equals("L")){
                System.out.println("Turn RIGHT onto " + y[k-1] + " street.");
            }
        }
        if(x[0].equals("R")) {
            System.out.println("Turn LEFT into your HOME.");
        } else if (x[0].equals("L")){
            System.out.println("Turn RIGHT into your HOME.");
        }
    }
}
