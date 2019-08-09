import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0; i < N; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            System.out.println(a+b);
        }
    }
}
