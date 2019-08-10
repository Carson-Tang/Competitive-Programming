import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<String> dict = new ArrayList<>();
        String in;
        while((in = br.readLine())!=null){
            String out = "";
            if(in.isEmpty()){
                System.out.println();
                dict.clear();
                continue;
            } else {
                String [] tok = in.split(" ");
                for(int i = 0; i < tok.length; i++){
                    if(!dict.contains(tok[i])){
                        dict.add(tok[i]);
                        out += tok[i];
                    } else {
                        out += (dict.indexOf(tok[i]) + 1);
                    }
                    if(i!=tok.length-1) {
                        out += " ";
                    }
                }
            }
            System.out.println(out);
        }
    }
}
