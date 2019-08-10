import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int students = 0, served = 0;
        while(true){
            String s = br.readLine();
            if(n>999){
                n=1;
            }
            if(s.equals("EOF")){
                return;
            } else if (s.equals("TAKE")){
                students++;
                n++;
                if(n>999){
                    n=1;
                }
            } else if (s.equals("SERVE")){
                served++;
            } else if (s.equals("CLOSE")){
                System.out.println(students + " " + (students-served) + " " + n);
                students = 0;
                served = 0;
            }
        }
    }
}
