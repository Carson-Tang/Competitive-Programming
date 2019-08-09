import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] have = br.readLine().split(" ");
        String [] need = br.readLine().split(" ");
        int c = 0;
        if(Integer.parseInt(have[0])>=Integer.parseInt(need[0])){
            have[0] = Integer.toString(Integer.parseInt(have[0]) - Integer.parseInt(need[0]));
            c += Integer.parseInt(need[0]);
            need[0]="0";
        } else {
            c += Integer.parseInt(have[0]);
            need[0] = Integer.toString(Integer.parseInt(need[0]) - Integer.parseInt(have[0]));
            have[0] = "0";
        }
        if(Integer.parseInt(have[1])>=Integer.parseInt(need[1])){
            have[1] = Integer.toString(Integer.parseInt(have[1]) - Integer.parseInt(need[1]));
            c += Integer.parseInt(need[1]);
            need[1]="0";
        } else {
            c += Integer.parseInt(have[1]);
            need[1] = Integer.toString(Integer.parseInt(need[1]) - Integer.parseInt(have[1]));
            have[1] = "0";
            if(Integer.parseInt(have[0])>=Integer.parseInt(need[1])){
                have[0] = Integer.toString(Integer.parseInt(have[0]) - Integer.parseInt(need[1]));
                c += Integer.parseInt(need[1]);
                need[1]="0";
            } else {
                c += Integer.parseInt(have[0]);
                need[1] = Integer.toString(Integer.parseInt(need[1]) - Integer.parseInt(have[0]));
                have[0]="0";
            }
        }
        if(Integer.parseInt(have[2])>=Integer.parseInt(need[2])){
            have[2] = Integer.toString(Integer.parseInt(have[2])-Integer.parseInt(need[2]));
            c+= Integer.parseInt(need[2]);
            need[2]="0";
        } else {
            c += Integer.parseInt(have[2]);
            need[2] = Integer.toString(Integer.parseInt(need[2]) - Integer.parseInt(have[2]));
            have[2]="0";
            if(Integer.parseInt(have[0])>=Integer.parseInt(need[2])){
                have[0] = Integer.toString(Integer.parseInt(have[0]) - Integer.parseInt(need[2]));
                c += Integer.parseInt(need[2]);
                need[2]="0";
            } else {
                c += Integer.parseInt(have[0]);
                need[2] = Integer.toString(Integer.parseInt(need[2]) - Integer.parseInt(have[0]));
                have[0]="0";
            }
        }
        if(Integer.parseInt(have[3])>=Integer.parseInt(need[3])){
            have[3] = Integer.toString(Integer.parseInt(have[3])-Integer.parseInt(need[3]));
            c+= Integer.parseInt(need[3]);
            need[3]="0";
        } else {
            c += Integer.parseInt(have[3]);
            need[3] = Integer.toString(Integer.parseInt(need[3]) - Integer.parseInt(have[3]));
            have[3] = "0";
            if(Integer.parseInt(have[2])>=Integer.parseInt(need[3])){
                have[2] = Integer.toString(Integer.parseInt(have[2])-Integer.parseInt(need[3]));
                c+= Integer.parseInt(need[3]);
                need[3]="0";
            } else {
                c += Integer.parseInt(have[2]);
                need[3] = Integer.toString(Integer.parseInt(need[3]) - Integer.parseInt(have[2]));
                have[2] = "0";
            }
            if(Integer.parseInt(have[1])>=Integer.parseInt(need[3])){
                have[1] = Integer.toString(Integer.parseInt(have[1])-Integer.parseInt(need[3]));
                c+= Integer.parseInt(need[3]);
                need[3]="0";
            } else {
                c += Integer.parseInt(have[1]);
                need[3] = Integer.toString(Integer.parseInt(need[3]) - Integer.parseInt(have[1]));
                have[1] = "0";
            }
            if(Integer.parseInt(have[0])>=Integer.parseInt(need[3])){
                have[0] = Integer.toString(Integer.parseInt(have[0])-Integer.parseInt(need[3]));
                c+= Integer.parseInt(need[3]);
                need[3]="0";
            } else {
                c += Integer.parseInt(have[0]);
                need[3] = Integer.toString(Integer.parseInt(need[3]) - Integer.parseInt(have[0]));
                have[0] = "0";
            }
        }
        if(Integer.parseInt(have[4])>=Integer.parseInt(need[4])){
            have[4] = Integer.toString(Integer.parseInt(have[4])-Integer.parseInt(need[4]));
            c+= Integer.parseInt(need[4]);
            need[4]="0";
        } else {
            c += Integer.parseInt(have[4]);
            need[4] = Integer.toString(Integer.parseInt(need[4]) - Integer.parseInt(have[4]));
            have[4] = "0";
            if(Integer.parseInt(have[0])>=Integer.parseInt(need[4])){
                have[0] = Integer.toString(Integer.parseInt(have[0]) - Integer.parseInt(need[4]));
                c += Integer.parseInt(need[4]);
                need[4]="0";
            } else {
                c += Integer.parseInt(have[0]);
                need[4] = Integer.toString(Integer.parseInt(need[4]) - Integer.parseInt(have[0]));
                have[0]="0";
            }
        }
        if(Integer.parseInt(have[5])>=Integer.parseInt(need[5])){
            have[5] = Integer.toString(Integer.parseInt(have[5])-Integer.parseInt(need[5]));
            c+= Integer.parseInt(need[5]);
            need[5]="0";
        } else {
            c += Integer.parseInt(have[5]);
            need[5] = Integer.toString(Integer.parseInt(need[5]) - Integer.parseInt(have[5]));
            have[5] = "0";
            if(Integer.parseInt(have[4])>=Integer.parseInt(need[5])){
                have[4] = Integer.toString(Integer.parseInt(have[4])-Integer.parseInt(need[5]));
                c+= Integer.parseInt(need[5]);
                need[5]="0";
            } else {
                c += Integer.parseInt(have[4]);
                need[5] = Integer.toString(Integer.parseInt(need[5]) - Integer.parseInt(have[4]));
                have[4] = "0";
            }
            if(Integer.parseInt(have[1])>=Integer.parseInt(need[5])){
                have[1] = Integer.toString(Integer.parseInt(have[1])-Integer.parseInt(need[5]));
                c+= Integer.parseInt(need[5]);
                need[5]="0";
            } else {
                c += Integer.parseInt(have[1]);
                need[5] = Integer.toString(Integer.parseInt(need[5]) - Integer.parseInt(have[1]));
                have[1] = "0";
            }
            if(Integer.parseInt(have[0])>=Integer.parseInt(need[5])){
                have[0] = Integer.toString(Integer.parseInt(have[0])-Integer.parseInt(need[5]));
                c+= Integer.parseInt(need[5]);
                need[5]="0";
            } else {
                c += Integer.parseInt(have[0]);
                need[5] = Integer.toString(Integer.parseInt(need[5]) - Integer.parseInt(have[0]));
                have[0] = "0";
            }
        }
        if(Integer.parseInt(have[6])>=Integer.parseInt(need[6])){
            have[6] = Integer.toString(Integer.parseInt(have[6])-Integer.parseInt(need[6]));
            c+= Integer.parseInt(need[6]);
            need[6]="0";
        } else {
            c += Integer.parseInt(have[6]);
            need[6] = Integer.toString(Integer.parseInt(need[6]) - Integer.parseInt(have[6]));
            have[6] = "0";
            if(Integer.parseInt(have[4])>=Integer.parseInt(need[6])){
                have[4] = Integer.toString(Integer.parseInt(have[4]) - Integer.parseInt(need[6]));
                c += Integer.parseInt(need[6]);
                need[6]="0";
            } else {
                c += Integer.parseInt(have[4]);
                need[6] = Integer.toString(Integer.parseInt(need[6]) - Integer.parseInt(have[4]));
                have[4]="0";
            }
            if(Integer.parseInt(have[2])>=Integer.parseInt(need[6])){
                have[2] = Integer.toString(Integer.parseInt(have[2]) - Integer.parseInt(need[6]));
                c += Integer.parseInt(need[6]);
                need[6]="0";
            } else {
                c += Integer.parseInt(have[2]);
                need[6] = Integer.toString(Integer.parseInt(need[6]) - Integer.parseInt(have[2]));
                have[2]="0";
            }
            if(Integer.parseInt(have[0])>=Integer.parseInt(need[6])){
                have[0] = Integer.toString(Integer.parseInt(have[0]) - Integer.parseInt(need[6]));
                c += Integer.parseInt(need[6]);
                need[6]="0";
            } else {
                c += Integer.parseInt(have[0]);
                need[6] = Integer.toString(Integer.parseInt(need[6]) - Integer.parseInt(have[0]));
                have[0]="0";
            }
        }
        int sumHave=0;
        for(int i = 0; i< 8; i++){
            sumHave += Integer.parseInt(have[i]);
        }
        if(sumHave>=Integer.parseInt(need[7])){
            c += Integer.parseInt(need[7]);
        } else {
            c += sumHave;
        }
        System.out.println(c);
    }
}
