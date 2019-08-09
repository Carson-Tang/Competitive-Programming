import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        String s;
        Map<String, Integer> x = new HashMap<>();
        x.put("a",1);
        x.put("e",1);
        x.put("i",1);
        x.put("o",1);
        x.put("u",1);
        x.put("y",1);
        while(true){
            s = sc.nextLine();
            if(s.equals("quit!")){
                break;
            } else if (s.length()>4){
                if(s.substring(s.length()-2,s.length()).equals("or")){
                    if(x.get(s.substring(s.length()-3,s.length()-2))==null){
                        System.out.println(s.substring(0,s.length()-2) + "our");
                    } else {
                        System.out.println(s);
                    }
                } else {
                    System.out.println(s);
                }
            } else {
                System.out.println(s);
            }
        }
    }
}
