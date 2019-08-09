import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> s = new ArrayList<>();
        ArrayList<String> v = new ArrayList<>();
        ArrayList<String> o = new ArrayList<>();
        int a,b,c;
        for(int i = 0; i < n; i++){
            a = Integer.parseInt(br.readLine());
            b = Integer.parseInt(br.readLine());
            c = Integer.parseInt(br.readLine());
            for(int k = 0; k < a; k++){
                s.add(br.readLine());
            }
            for(int k = 0; k < b; k++){
                v.add(br.readLine());
            }
            for(int k = 0; k < c; k++){
                o.add(br.readLine());
            }
            for(int k = 0; k < a; k++){
                for(int j = 0; j < b; j++){
                    for(int d = 0; d < c; d++){
                        System.out.println(s.get(k)+" "+v.get(j)+" "+o.get(d)+".");
                    }
                }
            }
            s.clear();
            v.clear();
            o.clear();
        }
    }
}
