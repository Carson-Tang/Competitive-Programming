import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(sc.readLine());
        String [] tok = sc.readLine().split(" ");
        boolean ar = true;
        boolean geo = true;
        int same = Integer.parseInt(tok[0]);
        boolean a = true;
        for(int i = 0; i < tok.length; i++){
            if(Integer.parseInt(tok[i])!=same){
                a = false;
                break;
            }
        }
        if(a){
            System.out.println("both");
            return;
        }
        for(int i = 1; i < n-1; i++){
            if((Integer.parseInt(tok[i]) - Integer.parseInt(tok[i-1])) != (Integer.parseInt(tok[i+1]) - Integer.parseInt(tok[i]))){
                ar = false;
            }
            if(Integer.parseInt(tok[i-1])==0 || Integer.parseInt(tok[i])==0){
              geo = false;
            } else if((Double.parseDouble(tok[i]) / Double.parseDouble(tok[i-1])) != (Double.parseDouble(tok[i+1]) / Double.parseDouble(tok[i]))){
                geo = false;
            }
        }
        if(Integer.parseInt(tok[0]) - Integer.parseInt(tok[1]) != (Integer.parseInt(tok[1]) - Integer.parseInt(tok[2]))) {
            ar = false;
        }
        if(Integer.parseInt(tok[1])==0 || Integer.parseInt(tok[2])==0){
            geo = false;
        }
        else if((Double.parseDouble(tok[0]) / Double.parseDouble(tok[1])) != (Double.parseDouble(tok[1]) / Double.parseDouble(tok[2]))){
            geo = false;
        }
        if(ar && geo){
            System.out.println("both");
        } else if (ar){
            System.out.println("arithmetic");
        } else if (geo) {
            System.out.println("geometric");
        } else {
            System.out.println("random");
        }
    }
}
