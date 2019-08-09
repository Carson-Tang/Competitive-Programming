import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = 0;
        int s = 0;
        for(int i = 0; i <= n; i++) {
            String text = sc.nextLine();
            for(int k = 0; k < text.length(); k++) {
                if(Character.toString(text.charAt(k)).equalsIgnoreCase("T")) {
                    t++;
                } else if(Character.toString(text.charAt(k)).equalsIgnoreCase(("S"))) {
                    s++;
                }
            }
        }
        if(t>s){
            System.out.println("English");
        } else if(s>t){
            System.out.println("French");
        } else {
            System.out.println("French");
        }
    }
}
