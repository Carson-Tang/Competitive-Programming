import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<Character,Integer>mp = new HashMap<>();
        mp.put('I',1); mp.put('V',5); mp.put('X',10); mp.put('L',50); mp.put('C',100); mp.put('D',500); mp.put('M',1000);
        while(n-->0){
            String [] tok = br.readLine().split("\\+|=");
            String a = tok[0], b = tok[1];
            int ans1 = 0, ans2 = 0;
            for(int i = 0; i < a.length(); i++){
                if(i<a.length()-1){
                    char e = a.charAt(i), ee = a.charAt(i+1);
                    if(e=='I'&&(ee=='V'||ee=='X')){
                        ans1 += mp.get(ee) - 1;
                        i++;
                    } else if (e=='X'&&(ee=='L'||ee=='C')){
                        ans1 += mp.get(ee) - 10;
                        i++;
                    } else if (e=='C'&&(ee=='D'||ee=='M')){
                        ans1 += mp.get(ee) - 100;
                        i++;
                    } else {
                        ans1 += mp.get(e);
                    }
                } else {
                    ans1 += mp.get(a.charAt(i));
                }
            }
            for(int i = 0; i < b.length(); i++){
                if(i<b.length()-1){
                    char e = b.charAt(i), ee = b.charAt(i+1);
                    if(e=='I'&&(ee=='V'||ee=='X')){
                        ans2 += mp.get(ee) - 1;
                        i++;
                    } else if (e=='X'&&(ee=='L'||ee=='C')){
                        ans2 += mp.get(ee) - 10;
                        i++;
                    } else if (e=='C'&&(ee=='D'||ee=='M')){
                        ans2 += mp.get(ee) - 100;
                        i++;
                    } else {
                        ans2 += mp.get(e);
                    }
                } else {
                    ans2 += mp.get(b.charAt(i));
                }
            }
            int tot = ans1 + ans2;
            String ans = "";
            if(tot<=1000){
                while(tot==1000){
                    ans += 'M';
                    tot-=1000;
                }
                while(tot>=900){
                    ans += "CM";
                    tot-=900;
                }
                while(tot>=500){
                    ans += 'D';
                    tot -= 500;
                }
                while(tot>=400){
                    ans += "CD";
                    tot -= 400;
                }
                while(tot>=100){
                    ans += "C";
                    tot -= 100;
                }
                while(tot>=90){
                    ans += "XC";
                    tot -= 90;
                }
                while(tot>=50){
                    ans += "L";
                    tot -= 50;
                }
                while(tot>=40){
                    ans += "XL";
                    tot -= 40;
                }
                while(tot>=10){
                    ans += "X";
                    tot -= 10;
                }
                while(tot>=9){
                    ans += "IX";
                    tot -= 9;
                }
                while(tot>=5){
                    ans += "V";
                    tot -= 5;
                }
                while(tot>=4){
                    ans += "IV";
                    tot -= 4;
                }
                while(tot>=1) {
                    ans += "I";
                    tot -= 1;
                }
                System.out.println(tok[0]+"+"+tok[1]+"="+ans);
            } else {
                System.out.println(tok[0] + "+" + tok[1] + "=CONCORDIA CUM VERITATE");
            }
        }
    }
}
