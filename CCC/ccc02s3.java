import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        Character[][] grid = new Character[r][c];
        String s;
        for (int i = 0; i < r; i++) {
            s = br.readLine();
            for (int k = 0; k < c; k++) {
                grid[i][k] = s.charAt(k);
            }
        }
        int m = Integer.parseInt(br.readLine());
        char[] moves = new char[m];
        for (int i = 0; i < m; i++) {
            moves[i] = br.readLine().charAt(0);
        }
        for (int i = 0; i < r; i++) {
            for (int k = 0; k < c; k++) {
                if (grid[i][k] != 'X') {
                    possible(moves, i, k, grid, r, c);
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int k = 0; k < c; k++) {
                System.out.print(grid[i][k]);
            }
            System.out.println();
        }
    }

    public static void possible(char[] moves, int i, int k, Character[][] grid, int r, int c) {
        // 1 == north, 2 == east, 3 == south, 4 == west
        int a = i;
        int b = k;
        int direction;
        //start facing north
        direction = 1;
        for (int j = 0; j < moves.length; j++) {
            if (moves[j] == 'L') {
                if (direction == 1) {
                    direction = 4;
                } else if (direction == 2) {
                    direction = 1;
                } else if (direction == 3) {
                    direction = 2;
                } else if (direction == 4) {
                    direction = 3;
                }
            } else if (moves[j] == 'R') {
                if (direction == 1) {
                    direction = 2;
                } else if (direction == 2) {
                    direction = 3;
                } else if (direction == 3) {
                    direction = 4;
                } else if (direction == 4) {
                    direction = 1;
                }
            } else if (moves[j] == 'F') {
                if (direction == 1) {
                    i--;
                } else if (direction == 2) {
                    k++;
                } else if (direction == 3) {
                    i++;
                } else if (direction == 4) {
                    k--;
                }
                if (i < 0 || k < 0) {
                    break;
                }
                if (i > r-1 || k > c-1) {
                    break;
                }
                if (grid[i][k] == 'X') {
                    break;
                }
            }
            if(j==moves.length-1){
                grid[i][k]='*';
            }
        }
        //start facing east
        i=a;
        k=b;
        direction = 2;
        for (int j = 0; j < moves.length; j++) {
            if (moves[j] == 'L') {
                if (direction == 1) {
                    direction = 4;
                } else if (direction == 2) {
                    direction = 1;
                } else if (direction == 3) {
                    direction = 2;
                } else if (direction == 4) {
                    direction = 3;
                }
            } else if (moves[j] == 'R') {
                if (direction == 1) {
                    direction = 2;
                } else if (direction == 2) {
                    direction = 3;
                } else if (direction == 3) {
                    direction = 4;
                } else if (direction == 4) {
                    direction = 1;
                }
            } else if (moves[j] == 'F') {
                if (direction == 1) {
                    i--;
                } else if (direction == 2) {
                    k++;
                } else if (direction == 3) {
                    i++;
                } else if (direction == 4) {
                    k--;
                }
                if (i < 0 || k < 0) {
                    break;
                }
                if (i > r-1 || k > c-1) {
                    break;
                }
                if (grid[i][k] == 'X') {
                    break;
                }
            }
            if(j==moves.length-1){
                grid[i][k]='*';
            }
        }
        //start facing south
        i=a;
        k=b;
        direction = 3;
        for (int j = 0; j < moves.length; j++) {
            if (moves[j] == 'L') {
                if (direction == 1) {
                    direction = 4;
                } else if (direction == 2) {
                    direction = 1;
                } else if (direction == 3) {
                    direction = 2;
                } else if (direction == 4) {
                    direction = 3;
                }
            } else if (moves[j] == 'R') {
                if (direction == 1) {
                    direction = 2;
                } else if (direction == 2) {
                    direction = 3;
                } else if (direction == 3) {
                    direction = 4;
                } else if (direction == 4) {
                    direction = 1;
                }
            } else if (moves[j] == 'F') {
                if (direction == 1) {
                    i--;
                } else if (direction == 2) {
                    k++;
                } else if (direction == 3) {
                    i++;
                } else if (direction == 4) {
                    k--;
                }
                if (i < 0 || k < 0) {
                    break;
                }
                if (i > r-1 || k > c-1) {
                    break;
                }
                if (grid[i][k] == 'X') {
                    break;
                }
            }
            if(j==moves.length-1){
                grid[i][k]='*';
            }
        }
        //start facing west
        i=a;
        k=b;
        direction = 4;
        for (int j = 0; j < moves.length; j++) {
            if (moves[j] == 'L') {
                if (direction == 1) {
                    direction = 4;
                } else if (direction == 2) {
                    direction = 1;
                } else if (direction == 3) {
                    direction = 2;
                } else if (direction == 4) {
                    direction = 3;
                }
            } else if (moves[j] == 'R') {
                if (direction == 1) {
                    direction = 2;
                } else if (direction == 2) {
                    direction = 3;
                } else if (direction == 3) {
                    direction = 4;
                } else if (direction == 4) {
                    direction = 1;
                }
            } else if (moves[j] == 'F') {
                if (direction == 1) {
                    i--;
                } else if (direction == 2) {
                    k++;
                } else if (direction == 3) {
                    i++;
                } else if (direction == 4) {
                    k--;
                }
                if (i < 0 || k < 0) {
                    break;
                }
                if (i > r-1 || k > c-1) {
                    break;
                }
                if (grid[i][k] == 'X') {
                    break;
                }
            }
            if(j==moves.length-1){
                grid[i][k]='*';
            }
        }
    }
}
