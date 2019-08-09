import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        int day = sc.nextInt();
        if(month == 2 && day == 18) {
            System.out.println("Special");
        } else if (month <= 2) {
            if(month == 2){
                if(day<18) {
                    System.out.println("Before");
                    System.exit(0);
                } else {
                    System.out.println("After");
                    System.exit(0);
                }
            }
            System.out.println("Before");
        } else if (month > 2) {
            System.out.println("After");
        }
        
    }
}
