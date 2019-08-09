import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int min = Integer.parseInt(br.readLine());
        int cycles = min/720;
        min%=720;
        int a=1,b=2,c=0,d=0;
        int cnt=0;
        while(min-->0){
            d++;
            if(d==10){
                d=0;
                c++;
                if(c==6){
                    c=0;
                    if(a==1&&b==2){
                        a=0;
                        b=1;
                    } else if (a==0){
                        b++;
                        if(b==10){
                            b=0;
                            a++;
                        }
                    }
                }
            }
            if(a==0){
                if(b-c==c-d) cnt++;
            } else {
                if(a-b==b-c && b-c==c-d) cnt++;
            }
        }
        cnt+=31*(cycles);
        System.out.println(cnt);
    }
}
