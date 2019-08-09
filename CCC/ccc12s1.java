import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<4){
            System.out.println("0");
        } else {
            System.out.println((n-1)*(n-2)*(n-3)/6);
        }
    }
}
