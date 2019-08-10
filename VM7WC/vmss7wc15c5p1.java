import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String s = sc.readLine();
        Double [][] chart = new Double[4][3];
        for(int i = 0; i < 4; i++){
            String [] tok = sc.readLine().split(" ");
            for(int k = 0; k < 3; k++){
                chart[i][k] = Double.parseDouble(tok[k]);
            }
        }
        int n = 0;
        if(chart[0][2]>=chart[1][2] && chart[0][2]>=chart[2][2] && chart[0][2]>=chart[3][2]){
            n = 0;
        } else if(chart[1][2]>=chart[0][2] && chart[1][2]>=chart[2][2] && chart[1][2]>=chart[3][2]){
            n=1;
        } else if(chart[2][2]>=chart[1][2] && chart[2][2]>=chart[0][2] && chart[2][2]>=chart[3][2]){
            n=2;
        } else {
            n=3;
        }
        double total = 0;
        if(s.equals("trees!")){
            chart[n][0] = chart[n][1];
        } else {
            chart[n][0] = (double)0;
        }
        for(int i = 0; i < 4; i++){
            total += (chart[i][0] /  chart[i][1]) * chart[i][2];
        }
        System.out.println((int)Math.round(total*100));
    }
}
