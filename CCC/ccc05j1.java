import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int day = sc.nextInt();
       int even = sc.nextInt();
       int week = sc.nextInt();
       double sumA=0;
       double sumB=0;
       int diffDay = day - 100;
       int diffDayB = day - 250;
       if(diffDay > 0) {
            sumA += 0.25*diffDay;
       }
       if(diffDayB>0) {
           sumB += 0.45*diffDayB;
       }
       sumA += 0.15*even + 0.2*week;
       sumB += 0.35*even + 0.25*week;
       sumA = (double)Math.round(sumA*100) / 100;
       sumB = (double)Math.round(sumB*100) / 100;
       System.out.println("Plan A costs " + sumA);
       System.out.println("Plan B costs " + sumB);
       if(sumA<sumB) {
           System.out.println("Plan A is cheapest.");
       } else if (sumB<sumA){
           System.out.println("Plan B is cheapest.");
       } else {
           System.out.println("Plan A and B are the same price.");
       }
    }
}
