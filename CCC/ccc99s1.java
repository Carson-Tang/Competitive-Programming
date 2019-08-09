import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        String [] tok = new String[52];
        int aTotal = 0;
        int bTotal = 0;
        for(int i = 0; i< 52; i++){
            tok[i] = sc.readLine();
        }
        for(int i =0; i < 52; i++){
            // a turn
            if(i%2==0) {
                if (tok[i].equals("ace")) {
                    if (i + 4 < 52) {
                        if (!tok[i + 1].equals("ace") && !tok[i + 1].equals("queen") && !tok[i + 1].equals("jack") && !tok[i + 1].equals("king")) {
                            if (!tok[i + 2].equals("ace") && !tok[i + 2].equals("queen") && !tok[i + 2].equals("jack") && !tok[i + 2].equals("king")) {
                                if (!tok[i + 3].equals("ace") && !tok[i + 3].equals("queen") && !tok[i + 3].equals("jack") && !tok[i + 3].equals("king")) {
                                    if (!tok[i + 4].equals("ace") && !tok[i + 4].equals("queen") && !tok[i + 4].equals("jack") && !tok[i + 4].equals("king")) {
                                        System.out.println("Player A scores 4 point(s).");
                                        aTotal += 4;
                                    }
                                }
                            }
                        }
                    }
                } else if (tok[i].equals("king")) {
                    if (i + 3 < 52) {
                        if (!tok[i + 1].equals("ace") && !tok[i + 1].equals("queen") && !tok[i + 1].equals("jack") && !tok[i + 1].equals("king")) {
                            if (!tok[i + 2].equals("ace") && !tok[i + 2].equals("queen") && !tok[i + 2].equals("jack") && !tok[i + 2].equals("king")) {
                                if (!tok[i + 3].equals("ace") && !tok[i + 3].equals("queen") && !tok[i + 3].equals("jack") && !tok[i + 3].equals("king")) {
                                    System.out.println("Player A scores 3 point(s).");
                                    aTotal += 3;
                                }
                            }
                        }
                    }
                } else if (tok[i].equals("queen")) {
                    if (i + 2 < 52) {
                        if (!tok[i + 1].equals("ace") && !tok[i + 1].equals("queen") && !tok[i + 1].equals("jack") && !tok[i + 1].equals("king")) {
                            if (!tok[i + 2].equals("ace") && !tok[i + 2].equals("queen") && !tok[i + 2].equals("jack") && !tok[i + 2].equals("king")) {
                                System.out.println("Player A scores 2 point(s).");
                                aTotal += 2;
                            }
                        }
                    }
                } else if (tok[i].equals("jack")) {
                    if (i + 1 < 52) {
                        if (!tok[i + 1].equals("ace") && !tok[i + 1].equals("queen") && !tok[i + 1].equals("jack") && !tok[i + 1].equals("king")) {
                            System.out.println("Player A scores 1 point(s).");
                            aTotal += 1;
                        }
                    }
                }
            } else {
                if(tok[i].equals("ace")){
                    if(i+4<52){
                        if(!tok[i+1].equals("ace") && !tok[i+1].equals("queen") && !tok[i+1].equals("jack") && !tok[i+1].equals("king")){
                            if(!tok[i+2].equals("ace") && !tok[i+2].equals("queen") && !tok[i+2].equals("jack") && !tok[i+2].equals("king")){
                                if(!tok[i+3].equals("ace") && !tok[i+3].equals("queen") && !tok[i+3].equals("jack") && !tok[i+3].equals("king")){
                                    if(!tok[i+4].equals("ace") && !tok[i+4].equals("queen") && !tok[i+4].equals("jack") && !tok[i+4].equals("king")){
                                        System.out.println("Player B scores 4 point(s).");
                                        bTotal += 4;
                                    }
                                }
                            }
                        }
                    }
                } else if(tok[i].equals("king")){
                    if(i+3<52){
                        if(!tok[i+1].equals("ace") && !tok[i+1].equals("queen") && !tok[i+1].equals("jack") && !tok[i+1].equals("king")){
                            if(!tok[i+2].equals("ace") && !tok[i+2].equals("queen") && !tok[i+2].equals("jack") && !tok[i+2].equals("king")){
                                if(!tok[i+3].equals("ace") && !tok[i+3].equals("queen") && !tok[i+3].equals("jack") && !tok[i+3].equals("king")){
                                    System.out.println("Player B scores 3 point(s).");
                                    bTotal += 3;
                                }
                            }
                        }
                    }
                } else if(tok[i].equals("queen")){
                    if(i+2<52){
                        if(!tok[i+1].equals("ace") && !tok[i+1].equals("queen") && !tok[i+1].equals("jack") && !tok[i+1].equals("king")){
                            if(!tok[i+2].equals("ace") && !tok[i+2].equals("queen") && !tok[i+2].equals("jack") && !tok[i+2].equals("king")){
                                System.out.println("Player B scores 2 point(s).");
                                bTotal += 2;
                            }
                        }
                    }
                } else if(tok[i].equals("jack")){
                    if(i+1<52){
                        if(!tok[i+1].equals("ace") && !tok[i+1].equals("queen") && !tok[i+1].equals("jack") && !tok[i+1].equals("king")){
                            System.out.println("Player B scores 1 point(s).");
                            bTotal += 1;
                        }
                    }
                }
            }
        }
        System.out.println("Player A: " + aTotal + " point(s).");
        System.out.println("Player B: " + bTotal + " point(s).");
    }
}
