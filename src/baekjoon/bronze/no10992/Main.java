package baekjoon.bronze.no10992;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int space = n-1;
        int star = 1;

        for(int i = 0; i < n; i++) {
            if(i == 0 || i == n-1) {
                System.out.println(" ".repeat(space) + "*".repeat(star));
            } else {
                System.out.println(" ".repeat(space) + "*" + " ".repeat(star-2) + "*");
            }
            space -= 1;
            star += 2;
        }
    }
}
