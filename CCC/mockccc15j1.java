import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(a.length()!=3 || b.length()!=7) {
            System.out.println("invalid");
        } else if (!a.equals("416") && !a.equals("647") && !a.equals("437")) {
            System.out.println("invalid");
        } else if (a.equals("416")) {
            System.out.println("valuable");
        } else {
            System.out.println("valueless");
        }


    }
}
