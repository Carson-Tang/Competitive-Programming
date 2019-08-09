import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args)throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> x = new HashMap<>();
        x.put('a', 2);
        x.put('b', 2);
        x.put('c', 2);
        x.put('d', 3);
        x.put('e', 3);
        x.put('f', 3);
        x.put('g', 4);
        x.put('h', 4);
        x.put('i', 4);
        x.put('j', 5);
        x.put('k', 5);
        x.put('l', 5);
        x.put('m', 6);
        x.put('n', 6);
        x.put('o', 6);
        x.put('p', 7);
        x.put('q', 7);
        x.put('r', 7);
        x.put('s', 7);
        x.put('t', 8);
        x.put('u', 8);
        x.put('v', 8);
        x.put('w', 9);
        x.put('x', 9);
        x.put('y', 9);
        x.put('z', 9);
        Map<Character, Integer> y = new HashMap<>();
        y.put('a', 1);
        y.put('b', 2);
        y.put('c', 3);
        y.put('d', 1);
        y.put('e', 2);
        y.put('f', 3);
        y.put('g', 1);
        y.put('h', 2);
        y.put('i', 3);
        y.put('j', 1);
        y.put('k', 2);
        y.put('l', 3);
        y.put('m', 1);
        y.put('n', 2);
        y.put('o', 3);
        y.put('p', 1);
        y.put('q', 2);
        y.put('r', 3);
        y.put('s', 4);
        y.put('t', 1);
        y.put('u', 2);
        y.put('v', 3);
        y.put('w', 1);
        y.put('x', 2);
        y.put('y', 3);
        y.put('z', 4);
        int c = 0;
        while(true){
            String s = sc.readLine();
            if(s.equals("halt")){
                System.exit(0);
            }
            c += y.get(s.charAt(0));
            for(int i = 1; i < s.length(); i++) {
                if(x.get(s.charAt(i))==x.get(s.charAt(i-1))){
                    c+=2;
                    c += y.get(s.charAt(i));
                } else {
                    c += y.get(s.charAt(i));
                }
            }
            System.out.println(c);
            c = 0;
        }
    }
}
