package Algroithms;

import java.util.Scanner;

public class tencentMoni2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = (int) (Math.log((double) t) / Math.log((double) 2));
        System.out.println("" + (n+1));
    }
}
