import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Double [] dis = new Double[3];
        double a,b,h,s;
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String[] tok = br.readLine().split(" ");
            dis[0] = Math.sqrt(Math.pow((Double.parseDouble(tok[2])-Double.parseDouble(tok[0])),2) + Math.pow(Double.parseDouble(tok[3])-Double.parseDouble(tok[1]),2));
            dis[1] = Math.sqrt(Math.pow((Double.parseDouble(tok[4])-Double.parseDouble(tok[2])),2) + Math.pow(Double.parseDouble(tok[5])-Double.parseDouble(tok[3]),2));
            dis[2] = Math.sqrt(Math.pow((Double.parseDouble(tok[4])-Double.parseDouble(tok[0])),2) + Math.pow(Double.parseDouble(tok[5])-Double.parseDouble(tok[1]),2));
            Arrays.sort(dis);
            a = dis[0];
            b = dis[1];
            h = dis[2];
            s=(a+b+h)/2;
            System.out.println(String.format("%.2f",Math.sqrt(s*(s-a)*(s-b)*(s-h))) + " " + String.format("%.2f",a+b+h));
        }
    }
}
