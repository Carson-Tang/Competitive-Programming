import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        for(int i = 0; i < 100; i++) {
            if((n*i)%x==1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println("No such integer exists.");
    }
}
