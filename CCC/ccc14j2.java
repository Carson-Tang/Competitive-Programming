import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numVote = sc.nextInt();
        sc.nextLine();
        String votes = sc.nextLine();
        int count = 0;
        for(int i = 0; i < votes.length(); i++) {
            if(votes.charAt(i) == 'A') {
                count++;
            }
        }
        int diff = numVote - count;
        if(diff == count){
            System.out.println("Tie");
        } else if (count > diff) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
