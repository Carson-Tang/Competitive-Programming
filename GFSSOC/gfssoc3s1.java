import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        for(int i = 0; i < Long.toBinaryString(n).length(); i++){
            System.out.print(1);
        }
    }
}
