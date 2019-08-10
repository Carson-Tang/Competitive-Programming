import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int x = sc.nextInt();
        int t = 0;
        while(((double)t/x)+((double)l/x)!=l){
            t++;
        }
        System.out.println(t);
    }
}
