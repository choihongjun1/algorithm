package baekjoon.bronze.no10991;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int space = n-1;
        int star = 1;

        for(int i = 0; i < n; i++) {
            String line = " ".repeat(space);
            for(int j = 1; j <= star; j++) {
                if(j % 2 != 0) line += "*";
                else line += " ";
            }
            System.out.println(line);
            space -= 1;
            star += 2;
        }
    }
}
