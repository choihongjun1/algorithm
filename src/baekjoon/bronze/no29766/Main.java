package baekjoon.bronze.no29766;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0; i <= s.length() - 4; i++) {
            if(s.charAt(i) == 'D') {
                if(s.substring(i, i + 4).equals("DKSH")) {
                    count++;
                    i += 3;
                }
            }
        }

        System.out.println(count);
    }
}
