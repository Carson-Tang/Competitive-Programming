import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        n = n.toLowerCase();
        n = n.replace("a","@");
        n = n.replace("b","8");
        n = n.replace("c","(");
        n = n.replace("d","|)");
        n = n.replace("e","3");
        n = n.replace("f","#");
        n = n.replace("g","6");
        n = n.replace("h","[-]");
        n = n.replace("i","|");
        n = n.replace("j","_|");
        n = n.replace("k","|<");
        n = n.replace("l","1");
        n = n.replace("m","[]\\/[]");
        n = n.replace("n","[]\\[]");
        n = n.replace("o","0");
        n = n.replace("p","|~");
        n = n.replace("q","(,)");
        n = n.replace("r","|%");
        n = n.replace("s","$");
        n = n.replace("t","']['");
        n = n.replace("u","|_|");
        n = n.replace("v","\\/");
        n = n.replace("w","\\/\\/");
        n = n.replace("x","}{");
        n = n.replace("y","`/");
        n = n.replace("z","2");
        n = n.replace("~","D");
        n = n.replace("%","Z");
        System.out.println(n);
    }
}
