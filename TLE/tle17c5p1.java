import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int x = 50;
        int y;
        while(true) {
            System.out.println("guess " + x);
            System.out.flush();
            y = sc.nextInt();
            System.out.println("answer " + (x-y));
            break;
        }
    }
}
