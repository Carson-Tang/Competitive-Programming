import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> x = new ArrayList<>();
        sc.nextLine();
        for(int i = 1; i < n; i++){
            x.add(Integer.toString(i));
        }
        for(int k = 0; k < n-1; k++) {
            x.remove(Integer.toString(sc.nextInt()));
        }
        System.out.println(x.get(0));
    }
}
