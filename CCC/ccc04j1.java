import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        a = Math.sqrt(a);
        int b = (int)a;
        System.out.println("The largest square has side length " + b + ".");
    }
}
