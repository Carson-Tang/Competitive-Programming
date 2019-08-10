import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d = Integer.parseInt(br.readLine());
        String [] tok = br.readLine().split(" ");
        int q = Integer.parseInt(br.readLine());
        String [] tok2 = br.readLine().split(" ");
        ArrayList<Integer> dimes = new ArrayList<>();
        ArrayList<Integer>quarters = new ArrayList<>();
        for(int i = 0; i < d; i++) dimes.add(Integer.parseInt(tok[i]));
        for(int i = 0; i < q; i++) quarters.add(Integer.parseInt(tok2[i]));
        Collections.sort(dimes);
        Collections.sort(quarters);
        double heavdime = (double)10/dimes.get(dimes.size()-1);
        double lightquart = (double)25/quarters.get(0);
        double heavquart = (double)25/quarters.get(quarters.size()-1);
        double lightdime = (double)10/dimes.get(0);
        if(heavdime>lightquart) System.out.println("Dimes are better");
        else if(heavquart>lightdime) System.out.println("Quarters are better");
        else System.out.println("Neither coin is better");

    }
}
