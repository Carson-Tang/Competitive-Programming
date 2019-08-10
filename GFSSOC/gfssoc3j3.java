import java.io.*;
import java.util.*;

public class Main {
    static class order implements Comparable<order>{
        String name;
        double score;
        order(String name, double score){
            this.name=name;
            this.score=score;
        }
        public int compareTo(order a){
            return Double.compare(this.score,a.score);
        }
    }
    public static void main (String [] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        int t = Integer.parseInt(br.readLine());
        ArrayList<order> present = new ArrayList<>();
        for(int i = 0; i < p; i++){
            String s = br.readLine();
            double score = Double.parseDouble(br.readLine());
            present.add(new order(s,score));
        }
        ArrayList<order> teach = new ArrayList<>();
        for(int i = 0; i < t; i++){
            String s = br.readLine();
            double score = Double.parseDouble(br.readLine());
            teach.add(new order(s,score));
        }
        Collections.sort(teach);
        Collections.sort(present);
        for(int i = 0; i < teach.size(); i++){
            System.out.println(teach.get(i).name + " will get a " + present.get(i).name);
        }
    }
}
