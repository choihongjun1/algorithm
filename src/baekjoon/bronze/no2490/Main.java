package baekjoon.bronze.no2490;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char[] result = new char[3];

        for(int i = 0; i < result.length; i++) {
            int count = 0; // 1 개수
            for(int j = 0; j < 4; j++) {
                if(sc.nextInt() == 1) count++;
            }
            switch(count) {
                case 0 :
                    result[i] = 'D';
                    break;
                case 1 :
                    result[i] = 'C';
                    break;
                case 2 :
                    result[i] = 'B';
                    break;
                case 3 :
                    result[i] = 'A';
                    break;
                case 4 :
                    result[i] = 'E';
                    break;
            }
        }

        for(char c : result) System.out.println(c);
    }
}
