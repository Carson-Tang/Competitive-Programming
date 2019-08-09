import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int a=0,b=0;
        while(true){
            String [] tokens = sc.readLine().split(" ");
            if(tokens[0].equals("7")){
                break;
            }
            if(tokens[0].equals("1")){
                if(tokens[1].equals("A")){
                    a = Integer.parseInt(tokens[2]);
                } else if (tokens[1].equals("B")) {
                    b = Integer.parseInt(tokens[2]);
                }
            } else if (tokens[0].equals("2")){
                if(tokens[1].equals("A")){
                    System.out.println(a);
                } else if (tokens[1].equals("B")) {
                    System.out.println(b);
                }
            } else if (tokens[0].equals("3")){
                if(tokens[1].equals("A")){
                    if(tokens[2].equals("B")){
                        a = a + b;
                    } else {
                        a = a + a;
                    }
                } else if (tokens[1].equals("B")) {
                    if(tokens[2].equals("A")){
                        b = a + b;
                    } else {
                        b = b + b;
                    }
                }
            } else if (tokens[0].equals("4")){
                if(tokens[1].equals("A")){
                    if(tokens[2].equals("B")){
                        a = a * b;
                    } else {
                        a = a * a;
                    }
                } else if (tokens[1].equals("B")) {
                    if(tokens[2].equals("A")){
                        b = a * b;
                    } else {
                        b = b * b;
                    }
                }
            }else if (tokens[0].equals("5")){
                if(tokens[1].equals("A")){
                    if(tokens[2].equals("B")){
                        a = a - b;
                    } else {
                        a = 0;
                    }
                } else if (tokens[1].equals("B")) {
                    if(tokens[2].equals("A")){
                        b = b - a;
                    } else {
                        b = 0;
                    }
                }
            } else if (tokens[0].equals("6")){
                if(tokens[1].equals("A")){
                    if(tokens[2].equals("B")){
                        a = a / b;
                    } else {
                        a = 1;
                    }
                } else if (tokens[1].equals("B")) {
                    if(tokens[2].equals("A")){
                        b = b / a;
                    } else {
                        b = 1;
                    }
                }
            }
        }
    }
}
