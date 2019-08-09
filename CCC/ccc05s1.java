import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Map<Character, Integer> x = new HashMap<>();
        x.put('A',2);
        x.put('B',2);
        x.put('C',2);
        x.put('D',3);
        x.put('E',3);
        x.put('F',3);
        x.put('G',4);
        x.put('H',4);
        x.put('I',4);
        x.put('J',5);
        x.put('K',5);
        x.put('L',5);
        x.put('M',6);
        x.put('N',6);
        x.put('O',6);
        x.put('P',7);
        x.put('Q',7);
        x.put('R',7);
        x.put('S',7);
        x.put('T',8);
        x.put('U',8);
        x.put('V',8);
        x.put('W',9);
        x.put('X',9);
        x.put('Y',9);
        x.put('Z',9);
        int n = Integer.parseInt(sc.readLine());
        for(int k = 0; k < n; k++) {
            String s = sc.readLine();
            s = s.replace("-","");
            s = s.substring(0, 10);
            for (int i = 0; i < s.length(); i++) {
                if (Character.isLetter(s.charAt(i))) {
                    s = s.replace(Character.toString(s.charAt(i)), Integer.toString(x.get(s.charAt(i))));
                }
            }
            for(int j = 0; j < 3; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.print("-");
            for(int j = 3; j < 6; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.print("-");
            for(int j = 6; j < 10; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println("");
        }
    }
}
