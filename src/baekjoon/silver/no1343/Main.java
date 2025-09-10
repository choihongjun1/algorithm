package baekjoon.silver.no1343;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        int x = 0;
        for(int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);

            if( c == 'X') {
                x++;
            } else {
                if(x % 2 == 1) {
                    System.out.println(-1);
                    return;
                }
            }
        }

        if(x % 2 == 1) {
            System.out.println(-1);
        } else {
            line = line.replace("XXXX", "AAAA");
            line = line.replace("XX", "BB");

            System.out.println(line);
        }

    }
}
