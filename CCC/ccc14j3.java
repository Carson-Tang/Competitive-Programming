import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = 100;
        int p2 = 100;
        int p1roll;
        int p2roll;
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            p1roll = sc.nextInt();
            p2roll = sc.nextInt();
            if(p1roll>p2roll) {
                p2 -= p1roll;
            } else if (p2roll>p1roll) {
                p1 -= p2roll;
            }
        }
        System.out.println(p1);
        System.out.println(p2);
    }
}
