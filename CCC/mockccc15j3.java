import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] x = new String[n];
        for(int i = 0; i < n ; i++) {
            x[i] = sc.next();
        }
        Set<String> y = new HashSet<>(Arrays.asList(x));
        System.out.println(y.size());
    }
}
