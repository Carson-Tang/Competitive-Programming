import java.io.*;
import java.util.*;

public class Main {
    static class po {
        int x,y;
        po(int a, int b){
            x=a;
            y=b;
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [][] val = new int[10][9];
        boolean [][] flag = new boolean[10][9];
        ArrayList<po> [][] x = new ArrayList[10][9];
        for(int [] row : val) Arrays.fill(row,-1);
        for(int i = 0; i < 10; i++){
            for(int k = 0; k < 9; k++) x[i][k]=new ArrayList<>();
        }
        int [][] indeg = new int[10][9];
        boolean [][] done = new boolean[10][9];
        for(int i = 0; i < 10; i++){
            String [] tok = br.readLine().split(" ");
            for(int k = 0; k < 9; k++){
                String s = tok[k];
                if(isNum(s)){
                    val[i][k]=Integer.parseInt(s);
                } else {
                    flag[i][k]=true;
                    String [] tok2 = s.split("\\+");
                    for(int j = 0; j < tok2.length; j++){
                        int xc = tok2[j].charAt(0) - 65;
                        int yc = tok2[j].charAt(1) - 49;
                        x[i][k].add(new po(xc,yc));
                        indeg[i][k]++;
                    }
                }
            }
        }
        LinkedList<po> q = new LinkedList<>();
        for(int i =0; i < 10; i++){
            for(int k = 0; k < 9; k++){
                if(indeg[i][k]==0){
                    done[i][k]=true;
                }
            }
        }
        for(int i = 9; i >= 0; i--){
            for(int k = 8; k >= 0; k--){
                if(val[i][k]==-1){
                    val[i][k] = bfs(x,val,i,k, flag,done);
                }
                done[i][k]=true;
            }
        }
        for(int i = 0; i < 10; i++){
            for(int k = 0; k < 9; k++){
                System.out.print((val[i][k]==-1 || flag[i][k]) ? "* " : val[i][k]+" ");
            }
            System.out.println();
        }
    }
    public static int bfs(ArrayList<po>[][]x, int [][] val, int startx, int starty, boolean [][] flag, boolean [][] done){
        LinkedList<Integer>q = new LinkedList<>();
        q.add(startx);
        q.add(starty);
        int tot = 0;
        int [][] v = new int[10][9];
        val[startx][starty]=-1;
        while(!q.isEmpty()){
            int xc = q.poll();
            int yc = q.poll();
            v[xc][yc]++;
            if(v[xc][yc]>1000) return -1;
            if(x[xc][yc].size()==0) tot += val[xc][yc];
            for (po neigh : x[xc][yc]) {
                if(done[neigh.x][neigh.y]){
                    if(val[neigh.x][neigh.y]<0) return -1;
                    tot += val[neigh.x][neigh.y];
                } else {
                    q.add(neigh.x);
                    q.add(neigh.y);
                }
            }
        }
        done[startx][starty]=true;
        flag[startx][starty]=false;
        return tot;
    }
    public static boolean isNum(String s){
        try {
            int a = Integer.parseInt(s);
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
