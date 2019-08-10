import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replace("-", "");
        int sum = Integer.parseInt(s.substring(0,1)) + Integer.parseInt(s.substring(1,2)) + Integer.parseInt(s.substring(2,3));
        int t = Integer.parseInt(s.substring(3, 4)) + Integer.parseInt(s.substring(4,5)) + Integer.parseInt(s.substring(5,6));
        int f = Integer.parseInt(s.substring(6, 7)) + Integer.parseInt(s.substring(7,8)) + Integer.parseInt(s.substring(8,9)) + Integer.parseInt(s.substring(9,10));
        if(sum == t && t==f) {
            System.out.println("Goony!");
        } else {
            System.out.println("Pick up the phone!");
        }
    }
}
