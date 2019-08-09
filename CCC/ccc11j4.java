import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> x = new HashMap<>();
        x.put("0-1",1);
        x.put("0-2",1);
        x.put("0-3",1);
        x.put("1-3",1);
        x.put("2-3",1);
        x.put("3-3",1);
        x.put("3-4",1);
        x.put("3-5",1);
        x.put("4-5",1);
        x.put("5-5",1);
        x.put("5-4",1);
        x.put("5-3",1);
        x.put("6-3",1);
        x.put("7-3",1);
        x.put("7-4",1);
        x.put("7-5",1);
        x.put("7-6",1);
        x.put("7-7",1);
        x.put("6-7",1);
        x.put("5-7",1);
        x.put("4-7",1);
        x.put("3-7",1);
        x.put("2-7",1);
        x.put("1-7",1);
        x.put("0-7",1);
        x.put("-1-7",1);
        x.put("-1-5",1);
        x.put("-1-6",1);
        String ax = "-1";
        String ay = "-5";
        boolean a = false;
        while(true){
            String [] tok = br.readLine().split(" ");
            if(tok[0].equals("d")){
                for(int i = 1; i <= Integer.parseInt(tok[1]); i++){
                    ay = Integer.toString(Integer.parseInt(ay)- 1 );
                    String s = ax + ay;
                    if(x.get(s)!=null){
                        a=true;
                    } else {
                        x.put(s,1);
                    }
                }
                if(a){
                    System.out.println(ax + " " + ay + " DANGER");
                    return;
                } else {
                    System.out.println(ax + " " + ay + " safe");
                }
            } else if (tok[0].equals("u")){
                for(int i = 1; i <= Integer.parseInt(tok[1]); i++){
                    ay = Integer.toString(Integer.parseInt(ay)+ 1 );
                    String s = ax + ay;
                    if(x.get(s)!=null){
                        a=true;
                    } else {
                        x.put(s,1);
                    }
                }
                if(a){
                    System.out.println(ax + " " + ay + " DANGER");
                    return;
                } else {
                    System.out.println(ax + " " + ay + " safe");
                }
            } else if (tok[0].equals("l")){
                for(int i = 1; i <= Integer.parseInt(tok[1]); i++){
                    ax = Integer.toString(Integer.parseInt(ax)- 1 );
                    String s = ax + ay;
                    if(x.get(s)!=null){
                        a=true;
                    } else {
                        x.put(s,1);
                    }
                }
                if(a){
                    System.out.println(ax + " " + ay + " DANGER");
                    return;
                } else {
                    System.out.println(ax + " " + ay + " safe");
                }
            } else if (tok[0].equals("r")){
                for(int i = 1; i <= Integer.parseInt(tok[1]); i++){
                    ax = Integer.toString(Integer.parseInt(ax)+ 1 );
                    String s = ax + ay;
                    if(x.get(s)!=null){
                        a=true;
                    } else {
                        x.put(s,1);
                    }
                }
                if(a){
                    System.out.println(ax + " " + ay + " DANGER");
                    return;
                } else {
                    System.out.println(ax + " " + ay + " safe");
                }
            } else if (tok[0].equals("q")){
                return;
            }
        }
    }
}
