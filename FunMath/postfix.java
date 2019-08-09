import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = br.readLine().split(" ");
        Stack<Double> s = new Stack<>();
        double a,b;
        for(int i = 0; i < tok.length; i++){
            if(tok[i].equals("+")){
                a = s.pop(); b = s.pop();
                s.push(b+a);
            } else if(tok[i].equals("-")){
                a = s.pop(); b = s.pop();
                s.push(b-a);
            } else if(tok[i].equals("/")){
                a = s.pop(); b = s.pop();
                s.push(b/a);
            } else if(tok[i].equals("*")){
                a = s.pop(); b = s.pop();
                s.push(b*a);
            } else if(tok[i].equals("%")){
                a = s.pop(); b = s.pop();
                s.push(b%a);
            } else if(tok[i].equals("^")){
                a = s.pop(); b = s.pop();
                s.push(Math.pow(b,a));
            } else s.push(Double.parseDouble(tok[i]));
        }
        System.out.println(s.pop());
    }
}
