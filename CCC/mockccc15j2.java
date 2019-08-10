import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int current = Integer.parseInt(sc.readLine());
        int want = Integer.parseInt(sc.readLine());
        int weight = Integer.parseInt(sc.readLine());
        double c = current * ((double)(100-weight)/100) + 0.001;
        for(int i = 0; i<= 100; i++){
            if(Math.round(c + (double)(weight * i)/100) >= want){
                System.out.println(i);
                return;
            }
        }
        System.out.println("DROP THE COURSE");
    }
}
