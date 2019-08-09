import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b,n;
        ArrayList<String> x = new ArrayList<>();
        x.add("A");
        x.add("B");
        x.add("C");
        x.add("D");
        x.add("E");
        while(true){
            b = sc.nextInt();
            n = sc.nextInt();
            if(b==4){
                for(int i = 0; i < 5; i++){
                    System.out.print(x.get(i));
                    System.out.print(" ");
                }
                return;
            } else if (b==1){
                for(int k = 0; k < n; k++) {
                    Collections.swap(x,0,1);
                    Collections.swap(x,1,2);
                    Collections.swap(x,2,3);
                    Collections.swap(x,3,4);
                }
            } else if (b==2){
                for(int k = 0; k < n; k++) {
                    Collections.swap(x, 4, 3);
                    Collections.swap(x, 3, 2);
                    Collections.swap(x, 2, 1);
                    Collections.swap(x, 1, 0);
                }
            } else if (b==3){
                for(int k = 0; k < n; k++) {
                    Collections.swap(x, 0, 1);
                }
            }
        }
    }
}
