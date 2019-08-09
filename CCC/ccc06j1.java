import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int [][] array = {{461,431,420,0},{100,57,70,0},{130,160,118,0},{167,266,75,0}};
        for(int i = 0; i < 4; i++){
        int input = sc.nextInt();
        sum += array[i][input-1];
        }
        System.out.println("Your total Calorie count is " + sum + ".");
    }
}
