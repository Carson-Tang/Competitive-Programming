import java.io.*;
import java.util.*;

public class Main {
    public static void main (String [] args) throws IOException{

        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            count++;
            int r = sc.nextInt(), c = sc.nextInt();
            if(r==0&&c==0) return;
            char [][] grid = new char[r][c];
            for(int i = 0; i < r; i++){
                for(int k = 0; k < c; k++){
                    grid[i][k]='S';
                }
            }
            int queens = sc.nextInt();
            for(int i = 0; i < queens; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                grid[x-1][y-1]='Q';
            }
            int knights = sc.nextInt();
            for(int i = 0; i < knights; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                grid[x-1][y-1]='K';
            }
            int pawns = sc.nextInt();
            for(int i = 0; i < pawns; i++){
                int x = sc.nextInt();
                int y = sc.nextInt();
                grid[x-1][y-1]='P';
            }
            for(int i = 0; i < r; i++){
                for(int k = 0; k < c; k++){
                    if(grid[i][k]=='Q'){
                        queen(i,k,grid,r,c);
                    } else if (grid[i][k]=='K'){
                        knight(i,k,grid,r,c);
                    }
                }
            }
            int safesquares = 0;
            for(int i = 0; i < r; i++){
                for(int k = 0; k < c; k++){
                    if(grid[i][k]=='S') safesquares++;
                }
            }
            System.out.println("Board " + count + " has " + safesquares + " safe squares.");
        }
    }
    public static void queen(int i, int k, char [][] grid, int r, int c){
        int xc = i;
        int yc = k;
        while(true){
            xc--;
            if(xc>-1 && yc>-1 && xc<r && yc<c){
                if(grid[xc][yc]=='S' || grid[xc][yc]=='W'){
                    grid[xc][yc]='W';
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        xc = i;
        yc = k;
        while(true){
            xc++;
            if(xc>-1 && yc>-1 && xc<r && yc<c){
                if(grid[xc][yc]=='S' || grid[xc][yc]=='W'){
                    grid[xc][yc]='W';
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        xc = i;
        yc = k;
        while(true){
            yc--;
            if(xc>-1 && yc>-1 && xc<r && yc<c){
                if(grid[xc][yc]=='S' || grid[xc][yc]=='W'){
                    grid[xc][yc]='W';
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        xc = i;
        yc = k;
        while(true){
            yc++;
            if(xc>-1 && yc>-1 && xc<r && yc<c){
                if(grid[xc][yc]=='S' || grid[xc][yc]=='W'){
                    grid[xc][yc]='W';
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        xc = i;
        yc = k;
        while(true){
            xc--;
            yc--;
            if(xc>-1 && yc>-1 && xc<r && yc<c){
                if(grid[xc][yc]=='S' || grid[xc][yc]=='W'){
                    grid[xc][yc]='W';
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        xc = i;
        yc = k;
        while(true){
            xc--;
            yc++;
            if(xc>-1 && yc>-1 && xc<r && yc<c){
                if(grid[xc][yc]=='S' || grid[xc][yc]=='W'){
                    grid[xc][yc]='W';
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        xc = i;
        yc = k;
        while(true){
            xc++;
            yc--;
            if(xc>-1 && yc>-1 && xc<r && yc<c){
                if(grid[xc][yc]=='S' || grid[xc][yc]=='W'){
                    grid[xc][yc]='W';
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        xc = i;
        yc = k;
        while(true){
            xc++;
            yc++;
            if(xc>-1 && yc>-1 && xc<r && yc<c){
                if(grid[xc][yc]=='S' || grid[xc][yc]=='W'){
                    grid[xc][yc]='W';
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }
    public static void knight(int i, int k , char [][] grid, int r, int c){
        int xc = i-2;
        int yc = k+1;
        if(xc>-1 && yc>-1 && xc<r && yc<c){
            if(grid[xc][yc]=='S'){
                grid[xc][yc]='W';
            }
        }
        xc = i-1;
        yc = k+2;
        if(xc>-1 && yc>-1 && xc<r && yc<c){
            if(grid[xc][yc]=='S'){
                grid[xc][yc]='W';
            }
        }
        xc = i+1;
        yc = k+2;
        if(xc>-1 && yc>-1 && xc<r && yc<c){
            if(grid[xc][yc]=='S'){
                grid[xc][yc]='W';
            }
        }
        xc = i+2;
        yc = k+1;
        if(xc>-1 && yc>-1 && xc<r && yc<c){
            if(grid[xc][yc]=='S'){
                grid[xc][yc]='W';
            }
        }
        xc = i+2;
        yc = k-1;
        if(xc>-1 && yc>-1 && xc<r && yc<c){
            if(grid[xc][yc]=='S'){
                grid[xc][yc]='W';
            }
        }
        xc = i+1;
        yc = k-2;
        if(xc>-1 && yc>-1 && xc<r && yc<c){
            if(grid[xc][yc]=='S'){
                grid[xc][yc]='W';
            }
        }
        xc = i-1;
        yc = k-2;
        if(xc>-1 && yc>-1 && xc<r && yc<c){
            if(grid[xc][yc]=='S'){
                grid[xc][yc]='W';
            }
        }
        xc = i-2;
        yc = k-1;
        if(xc>-1 && yc>-1 && xc<r && yc<c){
            if(grid[xc][yc]=='S'){
                grid[xc][yc]='W';
            }
        }
    }
}
