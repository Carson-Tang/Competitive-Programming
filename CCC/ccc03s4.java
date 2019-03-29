import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++){
            String s = br.readLine();
            ArrayList<String> suffix = new ArrayList<>();
            for(int k = 0; k < s.length(); k++){
                suffix.add(s.substring(k));
            }
            int cnt = 0;
            Collections.sort(suffix);
            String st = suffix.get(0);
            for(int k = 1; k < suffix.size(); k++){
                String curr = suffix.get(k);
                for(int j = 0; j < st.length(); j++){
                    if(st.charAt(j)==curr.charAt(j)){
                        cnt++;
                    } else break;
                }
                st = curr;
            }
            System.out.println((s.length()*(s.length()+1))/2-cnt+1);
        }
    }
}
