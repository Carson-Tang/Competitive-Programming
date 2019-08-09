import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<String>st = new Stack<>();
        while(true){
            String [] s = br.readLine().split(" ");
            if(s[0].equals("0")&&s.length==1) break;
            for(int i = s.length-1; i >= 0; i--){
                if(Character.isDigit(s[i].charAt(0))){
                    st.push(s[i]);
                } else {
                    String t = st.pop();
                    String t2 = st.pop();
                    st.push(t + " " + t2 + " " + s[i]);
                }
            }
            System.out.println(st.pop());
        }
    }
}
