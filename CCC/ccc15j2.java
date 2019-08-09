import java.io.*;
import java.util.*;
public class CCC_15_J2 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        text = text.replace(" ", "");
        text = text.replace(")","[").replace("(","]");
        text = text.replace(":-[","1").replace(":-]","2");
        int smile = 0;
        int sad = 0;
        for(int i = 0; i < text.length(); i++) {
            if(Character.toString(text.charAt(i)).equals("1")){
                smile++;
            } else if (Character.toString(text.charAt(i)).equals("2")) {
                sad++;
            }
        }
        if(smile==0 && sad == 0){
            System.out.println("none");
        } else if (smile == sad){
            System.out.println("unsure");
        } else if (smile > sad) {
            System.out.println("happy");
        } else if (sad > smile) {
            System.out.println("sad");
        }
    }
}
