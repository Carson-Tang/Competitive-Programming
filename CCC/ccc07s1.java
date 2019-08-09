import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        Integer [] x = new Integer[n*3];
        for(int i = 0; i < n*3; i++) {
            x[i] = sc.nextInt();
        }
        for(int k = 0; k < n; k++) {
            if(x[k*3]< 1989) {
                System.out.println("Yes");

            } else if (x[k*3] >1989) {
                System.out.println("No");

            } else if (x[k*3] == 1989) {
                if(x[1 + k*3] > 2) {
                    System.out.println("No");

                } else if (x[1 + k*3]==2) {
                    if(x[2 + k*3] > 27) {
                        System.out.println("No");
                    } else {
                        System.out.println("Yes");
                    }
                } else {
                    System.out.println("Yes");

                }
            }
        }
    }
}
