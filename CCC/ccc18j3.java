import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = sc.readLine().split(" ");
        int a = Integer.parseInt(tok[0]);
        int b = Integer.parseInt(tok[1]);
        int c = Integer.parseInt(tok[2]);
        int d = Integer.parseInt(tok[3]);

        System.out.println(0 + " " + a + " " +(a+b)+ " " +(a+b+c)+ " " + (a+b+c+d));
        System.out.println((a) + " " + 0 + " " + b + " " + (b+c)+ " " + (b+c+d));
        System.out.println((a+b) + " " +b+ " " + 0 +" "+c + " " + (c+d));
        System.out.println((a+b+c) + " " +(b+c)+ " " +c+ " " + 0 + " " + d);
        System.out.println((a+b+c+d) + " " +(b+c+d)+ " " +(c+d)+ " " + d+" " + 0);

    }
}
