import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] x = {"*x*", " xx", "* *"};
        for(int a = 0; a < n; a++) {
            x[0] += "*";
        }
        for(int b = 0; b < n; b++) {
            x[0] += "x";
        }
        for(int c = 0; c < n; c++) {
            x[0] += "*";
        }
        for(int d = 0; d < n; d++) {
            x[1] += " ";
        }
        for(int e = 0; e < n; e++) {
            x[1] += "x";
        }
        for(int f = 0; f < n; f++) {
            x[1] += "x";
        }
        for(int g = 0; g < n; g++) {
            x[2] += "*";
        }
        for(int h = 0; h < n; h++) {
            x[2] += " ";
        }
        for(int p = 0; p < n; p++) {
            x[2] += "*";
        }
        for(int i = 0; i < n; i++) {
            System.out.println(x[0].substring(3));
        }
        for(int j = 0; j < n; j++) {
            System.out.println(x[1].substring(3));
        }
        for(int k = 0; k < n; k++) {
            System.out.println(x[2].substring(3));
        }
    }
}
