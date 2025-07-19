package baekjoon.bronze.no31450;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int medal = sc.nextInt();
        int kid = sc.nextInt();
        if(medal % kid == 0) System.out.println("Yes");
        else System.out.println("No");
    }
}
