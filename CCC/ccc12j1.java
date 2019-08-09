import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();
        int speed = sc.nextInt();
        int fine = 0;
        int diff = speed-limit;
        if(speed > limit) {
            if (diff >= 1 && diff <= 20) {
                fine = 100;
            } else if (diff >= 21 && diff <= 30) {
                fine = 270;    
            } else if (diff >= 31) {
                fine = 500;
            }
            System.out.println("You are speeding and your fine is $" + fine + ".");
        } else {
            System.out.println("Congratulations, you are within the speed limit!");
        }
    }
}
