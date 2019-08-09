import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] list = new int[4];
        for(int i = 0; i < 4; i++) {
            list[i] = sc.nextInt();
        }
        if(list[0] > list[1] && list[1] > list[2] && list[2] > list[3]) {
            System.out.println("Fish Diving"); 
        } else if ((list[0] < list[1] && list[1] < list[2] && list[2] < list[3])) {
            System.out.println("Fish Rising");
        } else if ((list[0] == list[1] && list[1] == list[2] && list[2] == list[3])) {
            System.out.println("Fish At Constant Depth");
        } else {
            System.out.println("No Fish");
        }
    }
}
