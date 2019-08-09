import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s;
        int a;
        String f = "";
        String z = "";
        ArrayList<Integer> t  = new ArrayList<>();
        for(int i = 0; i < n; i++){
            s = br.readLine();
            t.clear();
            for(int k = 0; k< s.length(); k++){
                t.add(Integer.parseInt(Character.toString(s.charAt(k))));
            }
            for(int e = 0; e < t.size(); e++){
                System.out.print(t.get(e));
            }
            System.out.println();
            while(t.size()>2){
                a = t.get(t.size()-1);
                t.remove(t.size()-1);
                if(t.get(t.size()-1)>=a){
                    t.set(t.size()-1,t.get(t.size()-1)-a);
                } else {
                    z(t, t.size()-2);
                    t.set(t.size()-1,10 + t.get(t.size()-1)-a);
                }
                if(t.get(0)==0){
                    t.remove(0);
                }
                for(int e = 0; e < t.size(); e++){
                    System.out.print(t.get(e));
                }
                System.out.println();
            }
            for(int e = 0; e < t.size(); e++){
                z+= t.get(e);
            }
            if(Integer.parseInt(z)%11==0){
                System.out.println("The number " + s + " is divisible by 11.");
            } else {
                System.out.println("The number " + s + " is not divisible by 11.");
            }
            z="";
        }
    }
    public static void z(ArrayList<Integer> t, int index){
        if(t.get(index)!=0){
            t.set(index,t.get(index)-1);
        } else {
            t.set(index,9);
            z(t,index-1);
        }
    }
}
