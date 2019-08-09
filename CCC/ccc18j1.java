import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(sc.readLine());
        int b = Integer.parseInt(sc.readLine());
        int c = Integer.parseInt(sc.readLine());
        int d = Integer.parseInt(sc.readLine());
        if (a == 8 || a == 9) {
            if (d==8 || d==9) {
                if(b==c){
                    System.out.println("ignore");
                } else {
                    System.out.println("answer");
                }
            } else {
                System.out.println("answer");
            }
        } else {
            System.out.println("answer");
        }
    }
}
