import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            String x = sc.next();
            System.out.println(isSingle(x));
        }
    }
    public static int isSingle(String x) {
        int sum = 0;
        if(x.length()==1) {
            return Integer.parseInt(x);
        } else {
            for(int k = 0; k < x.length(); k++) {
                sum += Character.getNumericValue(x.charAt(k));
            }
            if(Integer.toString(sum).length()==1) {
                return sum;
            } else {
                return isSingle(Integer.toString(sum));
            }
        }
    }
}
